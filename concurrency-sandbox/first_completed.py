import asyncio


async def cancel_me():
    print('cancel_me(): before sleep')

    try:
        await asyncio.sleep(3600)
    except asyncio.CancelledError:
        print('cancel_me(): cancelling sleep')
        raise
    finally:
        print('cancel_me(): after sleep')


async def dotter():
    for i in range(10):
        await asyncio.sleep(1)
        print('*' * (i + 1))


async def main():

    dotter_task = asyncio.create_task(dotter())
    other_task = asyncio.create_task(cancel_me())
    await asyncio.sleep(0.1)

    finished, unfinished = await asyncio.wait([dotter_task, other_task], return_when=asyncio.FIRST_COMPLETED)

    for t in unfinished:
        t.cancel()


if __name__ == '__main__':
    asyncio.run(main())
