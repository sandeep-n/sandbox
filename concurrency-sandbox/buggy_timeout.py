"""
asyncio.wait_for does not terminate the executor process.
neither does executor.shutdown.
"""

import asyncio
import time
from concurrent.futures import ProcessPoolExecutor


def blocking():
    for _ in range(10):
        time.sleep(2)
        print('@$$')


async def main():
    executor = ProcessPoolExecutor(1)
    loop = asyncio.get_running_loop()
    try:
        await asyncio.wait_for(loop.run_in_executor(executor, blocking), timeout=2.0)
    except asyncio.TimeoutError:
        executor.shutdown(wait=False, cancel_futures=True)
        print('aw man')


if __name__ == '__main__':
    asyncio.run(main())
