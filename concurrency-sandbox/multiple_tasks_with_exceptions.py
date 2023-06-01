"""
What happens when we await -- in an async generator -- multiple coroutines, some of which throw exceptions?
"""

import asyncio
import time


async def breaks():
    time.sleep(0.5)
    raise ValueError('oops')


async def runs():
    time.sleep(0.2)
    return 1


async def async_gen():
    tasks = [asyncio.create_task(coro) for coro in [runs(), runs(), runs(), breaks(), runs()]]
    try:
        for task in tasks:
            v = await task
            yield v
    except ValueError as e:
        print(e)


async def main():
    async for x in async_gen():
        print(x)


if __name__ == '__main__':
    asyncio.run(main())
