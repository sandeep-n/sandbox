"""
Let's figure out if asyncio.gather runs things concurrently.
Compare two ways of running a bunch of coroutines. asyncio.gather runs them concurrently as expected, while
awaiting individual tasks within a dict comprehension means they run in sequence.
"""
import asyncio
import time

CHARACTERS = ['Alice', 'Bob', 'Charlie', 'David', 'Erin', 'Frank', 'Grace', 'Heidi']


async def initial(name):
    await asyncio.sleep(2)
    return name[0]


async def main():
    start = time.time()
    initials = dict(zip(CHARACTERS, await asyncio.gather(*(initial(x) for x in CHARACTERS))))
    # initials = {name: await initial(name) for name in CHARACTERS}

    print(initials)
    end = time.time()
    print(f'Total running time: {end - start :.2f}')

if __name__ == '__main__':
    asyncio.run(main())
