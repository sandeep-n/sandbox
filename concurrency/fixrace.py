import logging
import time
from concurrent.futures import ThreadPoolExecutor
from threading import Lock


class LockableFakeDb:

    def __init__(self):
        self.value = 0
        self.lock = Lock()

    def update(self, name):
        logging.info(f'Thread {name}: starting update')
        logging.info(f'Thread {name} about to get lock')
        with self.lock:
            logging.info(f'Thread {name} has lock')
            local_copy = self.value
            local_copy += 1
            time.sleep(0.1)
            self.value = local_copy
            logging.info(f'Thread {name} releasing lock')
        logging.info(f'Thread {name} has released lock')
        logging.info(f'Thread {name}: finishing update')


if __name__ == '__main__':
    logging.basicConfig(format='%(asctime)s: %(message)s', level=logging.INFO, datefmt='%H:%M:%S')
    db = LockableFakeDb()
    logging.info(f'Testing update. Initial value: {db.value}')
    with ThreadPoolExecutor(max_workers=2) as executor:
        for idx in range(2):
            executor.submit(db.update, idx)
    logging.info(f'Testing update: Final value: {db.value}')
