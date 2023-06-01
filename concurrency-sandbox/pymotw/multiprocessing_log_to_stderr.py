"""
The log_to_stderr() function is apparently useful for accessing internals of multiprocessing objects.
This function adds a handler that sends log messages to stderr.
"""
import logging
import multiprocessing
import sys


def worker():
    print('doing some work')
    sys.stdout.flush()


if __name__ == '__main__':
    multiprocessing.log_to_stderr(logging.DEBUG)
    p = multiprocessing.Process(target=worker)
    p.start()
    p.join()
