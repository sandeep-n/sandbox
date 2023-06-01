import os
import time


def follow(f):
    """
    :param f: a file object
    """
    f.seek(0, os.SEEK_END)
    while True:
        line = f.readline()
        if not line:
            time.sleep(0.1)
            continue
        yield line
