"""
Illustrates the simplest way to run code in a second process: instantiate a Process object and call start() on it.

Tidbit: while this code is supposed to simply print "worker" five times, it can supposedly be mangled since
the processes compete for the output stream.
"""

import multiprocessing
import os


def worker():
    print(f'{os.getpid()}')
    print('worker')


if __name__ == '__main__':
    jobs = []
    for i in range(5):
        p = multiprocessing.Process(target=worker)
        jobs.append(p)
        p.start()
