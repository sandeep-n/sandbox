"""
`asyncio.run` always creates a new event loop and closes it at the end.
This means that when a coroutine is run in the loop, there is a wrapping Task present.
"""

import asyncio
import random


async def foo():
    await asyncio.sleep(random.random() * 10)


async def bar():
    await asyncio.sleep(random.random() * 10)


async def loop_watcher():
    while True:
        tasks = asyncio.all_tasks(asyncio.get_running_loop())
        if len(tasks) > 2:  # i.e., there are non-zero sleeper tasks remaining
            print(f'Running tasks: {[task.get_name() for task in tasks]}')
            await asyncio.sleep(0.1)
        else:
            break


async def main():
    random_sleeping_tasks = [asyncio.create_task(foo(), name=f'sleeper-{x}') for x in range(10)]
    watcher_task = asyncio.create_task(loop_watcher())

    await asyncio.gather(*random_sleeping_tasks)
    await watcher_task

if __name__ == '__main__':
    asyncio.run(main())
