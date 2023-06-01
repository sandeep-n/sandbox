import asyncio


async def main():
    loop = asyncio.get_running_loop()
    fut = loop.create_future()
    print(f'Future created; has state done={fut.done()}')
    print(f'Setting result')
    fut.set_result(1)
    print(f'has state done={fut.done()}')
    print('Attempting to set result again...')
    fut.set_result(2)


if __name__ == '__main__':
    asyncio.run(main())
