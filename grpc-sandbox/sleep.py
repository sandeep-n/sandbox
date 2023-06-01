import asyncio


async def zzz():
    await asyncio.sleep(2)
    print('awake now')


if __name__ == '__main__':
    asyncio.run(zzz())
