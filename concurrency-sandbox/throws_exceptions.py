"""
What happens when a coroutine that throws an exception is awaited?
"""

import asyncio
import time


async def breaks():
    time.sleep(2)
    raise ValueError('boohoo')


async def sync_thing():
    task = asyncio.create_task(breaks())
    await asyncio.sleep(0.1)
    try:
        result = await task
    except Exception as e:
        print(f'We got an exception: {e} ({type(e)})')


def main():
    asyncio.run(sync_thing())

if __name__ == '__main__':
    main()
