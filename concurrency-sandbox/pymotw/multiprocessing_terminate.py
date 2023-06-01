"""
If a process appears hung or deadlocked, can be killed forcibly by calling terminate() on it.

Note: the preferred method is to use the "poison pill" method to signal a process to exit.
"""
import multiprocessing
import time


def slow_worker():
    print('starting worker')
    time.sleep(0.2)
    print('finished worker')


if __name__ == '__main__':
    p = multiprocessing.Process(target=slow_worker)
    print(f'BEFORE: {p} {p.is_alive()}')

    p.start()
    print(f'DURING: {p} {p.is_alive()}')

    p.terminate()
    print(f'TERMINATED: {p} {p.is_alive()}')

    p.join()
    print(f'JOINED: {p} {p.is_alive()}')
