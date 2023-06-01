import logging
import time
from concurrent.futures import ThreadPoolExecutor


def thread_function(name):
    logging.info(f'Thread {name}: started')
    time.sleep(2)
    logging.info(f'Thread {name}: finishing')


if __name__ == '__main__':
    logging.basicConfig(
        format="%(asctime)s: %(message)s",
        level=logging.INFO,
        datefmt="%H:%M:%S"
    )

    with ThreadPoolExecutor(max_workers=3) as executor:
        executor.map(thread_function, range(3))
