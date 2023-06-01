"""
Cancelling Futures/Tasks: something can only be effectively cancelled if it relinquishes
control at some point. If it is cancelled, the event loop won't pick it back up.

Toggle long_waiter below to use synchronous sleep instead and see how the behavior changes:
a function call can not be short-circuited, ever.
"""

import asyncio
import time


async def long_waiter():
    print(f'Beginning execution of waiter')
    for i in range(10):
        print('*' * (i+1))
        await asyncio.sleep(1)
    return 42


async def main():
    task = asyncio.create_task(long_waiter())
    await asyncio.sleep(5)  # we've yielded control to the event loop
    task.cancel()
    x = await task


if __name__ == '__main__':
    asyncio.run(main())
