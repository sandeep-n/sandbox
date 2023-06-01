"""
Demonstrates that a long-running computation can be farmed out among a process pool with an
appreciable speedup.

Speedup is present with some overhead. For instance, running this a single time with a single worker
is faster than running it five times with five workers, which in turn is faster than (but not 5x the speed of)
running it five times with a single worker.
"""

import asyncio
import math
import time
from concurrent.futures import ProcessPoolExecutor


def is_prime(n):
    # time.sleep(0.1)
    done_message = f'done testing {n}'
    if n == 1:
        print(done_message)
        return False
    elif n == 2:
        print(done_message)
        return True
    elif n % 2 == 0:
        print(done_message)
        return False
    else:
        for x in range(3, math.ceil(math.sqrt(n)) + 1, 2):
            if n % x == 0:
                print(done_message)
                return False
            else:
                continue
        print(done_message)
        return True


async def main():
    a = 29_996_224_275_833
    N = 10  # nunber of times to check
    start_time = time.time()
    loop = asyncio.get_running_loop()
    with ProcessPoolExecutor(max_workers=10) as executor:
        futures = [loop.run_in_executor(executor, is_prime, a) for _ in range(N)]
        results = await asyncio.gather(*futures, return_exceptions=False)
        print(list(zip(range(N), results)))
    end_time = time.time()
    print(f'Total running time: {end_time - start_time}')


if __name__ == '__main__':
    asyncio.run(main())
