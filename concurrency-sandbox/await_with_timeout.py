"""
Switch between time.sleep (synchronous) and asyncio.sleep (asynchronous) to see the behavior of asyncio.wait_for when a timeout is used. 
Synchronous code is _not_ interrupted -- the time.sleep version of long_waiter completes execution since it never yields control to the event loop. 
"""

import asyncio
import logging
import time


async def long_waiter(wait_t_secs=5):
    print(f'Beginning execution of waiter')
    n = 10
    sleep = wait_t_secs / n
    for i in range(n):
        print('*' * (i + 1))
        # time.sleep(sleep)
        await asyncio.sleep(sleep)
    return 42


async def main():
    try:
        await asyncio.wait_for(long_waiter(5), 4)
    except asyncio.TimeoutError:
        logging.exception('Too late!', exc_info=True)


if __name__ == '__main__':
    asyncio.run(main())
