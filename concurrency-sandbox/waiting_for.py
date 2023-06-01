"""
Explore the behavior of asyncio.wait_for.
The official docs say that asyncio.wait_for will cancel any futures that are not done by the timeout, but will wait to
return until the future is actually cancelled.

This means that if the Future/Task wraps a long-running synchronous function, it will not in fact timeout in any
meaningful way: the attempt to cancel the Future will fail, and since wait_for waits for the future to be
cancelled before returning/raising, we don't actually see any error raised.

Check this by toggling between sync_sleeper and async_sleeper below.

When invoked with async_sleeper, the future is cancelled (resulting in a CancelledError), and a
TimeoutError (handled in the code below) is thrown.
"""
import asyncio
import time


async def sync_sleeper(n):
    for _ in range(n):
        print('$$$')
        time.sleep(1)
    return 'toodleoo'


async def async_sleeper(n):
    for _ in range(n):
        print('@@@')
        await asyncio.sleep(1)


async def main():
    start = time.time()
    try:
        await asyncio.wait_for(async_sleeper(5), timeout=3)
    except asyncio.TimeoutError:
        print('timeout!')
    finally:
        end = time.time()
        print(f'Total running time: {end - start :.2f}')

if __name__ == '__main__':
    asyncio.run(main())
