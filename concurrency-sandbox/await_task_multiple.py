"""
Compare with await_twice.py: a Task (as opposed to a coroutine) can be
awaited multiple times.
"""

import asyncio
import time


async def dotter():
    for i in range(10):
        time.sleep(0.1)
        print('.' * i)
    return 31


async def main():
    task = asyncio.create_task(dotter())
    x = await task
    y = await task
    print(f'x: {x}')
    print(f'y: {y}')


if __name__ == '__main__':
    asyncio.run(main())
