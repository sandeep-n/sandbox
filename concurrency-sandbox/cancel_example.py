"""
This is an example from python's docs for asyncio, showing Task.cancel().
"""
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


async def main():
    task = asyncio.create_task(cancel_me())
    await asyncio.sleep(1)

    task.cancel()


if __name__ == '__main__':
    asyncio.run(main())
