import asyncio


async def breaks():
    return 10


async def main():
    try:
        x = await breaks()
    except ZeroDivisionError as e:
        print(f"Check yourself before you wreck yourself: {e}")
    else:
        print(x)


if __name__ == '__main__':
    asyncio.run(main())
