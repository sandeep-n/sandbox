"""
Exeggcutor has an mp.Queue with one producer and one consumer. Can more consumers help speed things along?
"""

import multiprocessing
import os
import time


def slow_function(n: int):
    time.sleep(5)
    print(f"{os.getpid()}: processed {n}")


def worker(queue: multiprocessing.Queue):
    while True:
        thing = queue.get()
        if thing is None:
            queue.put(thing)
            break
        else:
            slow_function(thing)


def main():
    print(f"Parent PID: {os.getpid()}")
    NUM_CONSUMERS = 5

    queue = multiprocessing.Queue()

    consumer_pool = multiprocessing.Pool(processes=NUM_CONSUMERS, initializer=worker, initargs=(queue,))

    for x in range(23):
        queue.put(x)

    # Wait for the worker to finish
    queue.put(None)
    queue.close()
    queue.join_thread()
    consumer_pool.close()
    consumer_pool.join()



if __name__ == '__main__':
    start = time.perf_counter()
    main()
    end = time.perf_counter()
    print(f"Run time: {end-start:.3f}")
