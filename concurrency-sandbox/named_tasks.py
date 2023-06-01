import asyncio


async def dotter(n):
    for i in range(n):
        await asyncio.sleep(0.1)
        print([task.name for task in asyncio.all_tasks(asyncio.get_running_loop())])
        print('.' * (i + 1))
    return n


async def main():
    n = 10
    task = asyncio.create_task(dotter(n))
    # task.name = f'dotter({n})'
    x = await task
    # print(task.name)
    print(f'x: {x}')


if __name__ == '__main__':
    asyncio.run(main())
