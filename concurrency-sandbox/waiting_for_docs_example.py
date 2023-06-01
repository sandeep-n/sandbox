"""
https://docs.python.org/3.7/library/asyncio-task.html#timeouts
"""

import asyncio
import time


async def eternity():
    # Sleep for one hour
    await asyncio.sleep(3600)
    print('yay!')


async def main():
    # Wait for at most 1 second
    start = time.time()
    await asyncio.wait_for(eternity(), timeout=1.0)
    end = time.time()
    print(f'{end - start :.2f}')


if __name__ == '__main__':
    asyncio.run(main())
