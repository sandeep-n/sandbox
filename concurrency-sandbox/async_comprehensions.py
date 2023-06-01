import asyncio
import time

CHARACTERS = ['Alice', 'Bob', 'Charlie', 'David', 'Erin', 'Frank', 'Grace', 'Heidi']


async def initial(name):
    await asyncio.sleep(0.03)
    return name[0]


async def main():
    initials = [await initial(name) for name in CHARACTERS]
    print(initials)


if __name__ == '__main__':
    asyncio.run(main())
