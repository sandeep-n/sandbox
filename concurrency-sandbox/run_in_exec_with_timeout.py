"""
Run a single callable in a single process executor. 
"""

import asyncio
import time
from concurrent.futures import ProcessPoolExecutor, wait as cf_wait


def waiter(dur):
    time.sleep(dur)
    return dur


async def main():
    with ProcessPoolExecutor(max_workers=1) as executor:
        loop = asyncio.get_running_loop()
        future = loop.run_in_executor(executor, waiter)


if __name__ == '__main__':
    asyncio.run(main())
