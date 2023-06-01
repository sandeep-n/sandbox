"""
If we start up many processes in a ProcessPoolExecutor, and then terminate the main process, will all processes be shut down?
"""

import asyncio
from concurrent.futures import ProcessPoolExecutor
import os
import time



def cpu_bound():
    return sum(i * i for i in range(10 ** 7))


def sleeper(i):
    print(f'sleeper {i} (PID: {os.getpid()}) entering sleep')
    time.sleep(200)  # sleep for 200 secs
    return i * i


async def main():
    with ProcessPoolExecutor() as pool:
        loop = asyncio.get_running_loop()
        tasks = [loop.run_in_executor(pool, sleeper, x) for x in range(5)]
        squares = await asyncio.gather(*tasks)
        print(squares)


if __name__ == '__main__':
    print(f'PID: {os.getpid()}; PPID: {os.getpgid(os.getpid())}')
    asyncio.run(main())
