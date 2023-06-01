import asyncio
import time

CHARACTERS = ['Alice', 'Bob', 'Charlie', 'David', 'Erin', 'Frank', 'Grace', 'Heidi']


async def initial(name):
    await asyncio.sleep(2)
    return name[0]

async def initials(names=CHARACTERS):
    return await asyncio.gather(*(initial(name) for name in names))

def main():
    loop = asyncio.new_event_loop()
    asyncio.set_event_loop(loop)
    result = loop.run_until_complete(initials())
    print(f"BIG RESULT: {result}")

if __name__ == '__main__':
    main()
