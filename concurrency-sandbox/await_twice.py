"""
A coroutine object must be awaited to have its code block execute.
What happens if it is awaited more than once? Much like an exhausted generator, throws an
exception.
"""

import asyncio


async def worker():
    await asyncio.sleep(2)
    return 24


async def main():
    w_0 = worker()
    value = await w_0
    print(value)
    try:
        value_again = await w_0
    except RuntimeError as e:
        print(e)


if __name__ == '__main__':
    asyncio.run(main())
