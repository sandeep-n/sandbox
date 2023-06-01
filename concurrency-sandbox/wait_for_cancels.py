"""
asyncio.wait_for attempts to cancel futures. does it take? 
It does when the coroutine has asynchronous code. 
"""
import asyncio
import time


async def sync_sleeper(n):
    for _ in range(n):
        print('$$$')
        await asyncio.sleep(1)
        # time.sleep(1)
    return 'toodleoo'


async def main():
    task = asyncio.create_task(sync_sleeper(5))
    start = time.time()
    try:
        await asyncio.wait_for(task, timeout=3)
    except asyncio.TimeoutError:  # shouldn't happen
        print('timeout!')
        print(f'Task cancelled: {task.cancelled()}') 
    else:
        end = time.time()
        print(f'Total running time: {end - start :.2f}')
        print(f'Task cancelled: {task.cancelled()}')

if __name__ == '__main__':
    asyncio.run(main())
