import asyncio


async def async_fun():
    await asyncio.sleep(1)
    return 43


def sync_fun():
    return asyncio.run(async_fun())


async def main():
    print('running sync fun first')
    x = sync_fun()
    await asyncio.sleep(1)
    return x


if __name__ == '__main__':
    answer = asyncio.run(main())
    print(answer)
