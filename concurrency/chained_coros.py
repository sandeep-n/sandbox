import asyncio
import random
import sys
import time


async def process_1(n):
    i = random.randint(0, 10)
    print(f'process_1({n}) sleeping for {i} secs')
    await asyncio.sleep(i)
    result = f'result{n}-1'
    print(f'returning process_1({n}) == {result}')
    return result


async def process_2(n, arg):
    i = random.randint(0, 10)
    print(f'process_2({n, arg}) sleeping for {i} secs')
    await asyncio.sleep(i)
    result = f'result{n}-2'
    print(f'returning process_2({n, arg}) == {result}')
    return result


async def process_chain(n):
    start = time.perf_counter()
    p1 = await process_1(n)
    p2 = await process_2(n, p1)
    elapsed = time.perf_counter() - start
    print(f'--> Chained result{n} => {p1} => {p2} (took {elapsed:0.2f} secs)')


async def main(*args):
    await asyncio.gather(*(process_chain(n) for n in args))


if __name__ == '__main__':
    random.seed(444)
    args = [1, 2, 3] if len(sys.argv) == 1 else map(int, sys.argv[1:])
    start = time.perf_counter()
    asyncio.run(main(*args))
    elapsed = time.perf_counter() - start
    print(f'Program finished in {elapsed:0.2f} seconds.')
