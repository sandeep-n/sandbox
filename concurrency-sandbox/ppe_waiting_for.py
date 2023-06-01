"""
Waiting on futures run in executors. Using asyncio.wait_for and other mechanisms. In this case, asyncio.wait_for
actually cancels the task (!?!?!?).

Even though TimeoutError is raised at the expected time (3 seconds after start of execution)...
"""

import asyncio
import time
from concurrent.futures import ProcessPoolExecutor


def sync_sleeper(n):
    for _ in range(n):
        print('$$$')
        time.sleep(1)


async def timed_runner(timeout):
    with ProcessPoolExecutor(max_workers=1) as executor:
        loop = asyncio.get_running_loop()
        task = loop.run_in_executor(executor, sync_sleeper, 10)
        try:
            await asyncio.wait_for(task, timeout=timeout)
            return 42
        except asyncio.TimeoutError as e:
            print(f'{type(e)}!')
            raise e
            # executor.shutdown(wait=False)


async def timed_runner_2(timeout):
    executor = ProcessPoolExecutor(max_workers=1)
    loop = asyncio.get_running_loop()
    task = loop.run_in_executor(executor, sync_sleeper, 10)
    try:
        await asyncio.wait_for(task, timeout=timeout)
        return 84
    except asyncio.TimeoutError as e:
        print(f'{type(e)}')
        return


async def main():
    start = time.time()
    # task = asyncio.create_task(timed_runner(3))
    try:
        await timed_runner(3)
    except:
        # print(f'Task cancelled: {task.cancelled()}')
        print('TIMEOUT!')
    end = time.time()
    print(f'elapsed time: {end - start :.2f}')

    
if __name__ == '__main__':
    asyncio.run(main())
