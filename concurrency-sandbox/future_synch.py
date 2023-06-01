"""
Invoking a Future object's synchronous interface.
Task is a subclass of Future.
"""
import asyncio
import time


async def waiter():
    await asyncio.sleep(5)
    return 20


async def main():
    task = asyncio.create_task(waiter())
    print(f'{time.strftime("%X")}: {task.done()}')
    await task
    print(f'{time.strftime("%X")}: {task.done()}')
    print(f'{task.result()}')


if __name__ == '__main__':
    asyncio.run(main())
