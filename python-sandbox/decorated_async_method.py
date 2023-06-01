import asyncio
from functools import wraps
import time



def shielded(func):
    """
    Wrap function in asyncio.shield to prevent cancellation.
    """
    @wraps(func)
    async def wrapped(*args, **kwargs):
        return await asyncio.shield(func(*args, **kwargs))
    return wrapped


class Parent:
    def __init__(self, x: int):
        self.each_sleep = x
        self.symbol = '*'

    @shielded
    async def long_running(self, n):
        for i in range(n):
            try:
                await asyncio.sleep(self.each_sleep)
                print(self.symbol * (i + 1))
            except asyncio.CancelledError:
                print(f'{self.__class__.__name__} was cancelled')
                raise
        print(f'Exiting {self.__class__.__name__}')


class Child(Parent):
    def __init__(self, x: int):
        super().__init__(x=x)
        self.symbol = '+'
    
    async def long_running(self, n):
        await super().long_running.__wrapped__(self, n)
    
    async def just_delegate(self, n):
        await self.long_running(n)


async def containing_coro():
    parent = Parent(1)
    child = Child(1)

    num_iters = 10

    parent_task = asyncio.create_task(parent.long_running(num_iters))
    child_task = asyncio.create_task(child.just_delegate(num_iters))
    
    await asyncio.gather(parent_task, child_task)


async def main():
    timeout = 4.0
    await asyncio.wait_for(containing_coro(), timeout=timeout)
    

if __name__ == '__main__':
    loop = asyncio.new_event_loop()
    loop.run_until_complete(main())

    loop.run_forever() 
