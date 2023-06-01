import logging
import time
from concurrent.futures import ThreadPoolExecutor


class FakeDatabase:

    def __init__(self):
        self.value = 0

    def update(self, name):
        logging.info(f'Thread {name}: starting update')

        # This following block simulates reading a record from the DB, manipulating it, and writing it back:
        # BEGIN BLOCK
        local_copy = self.value
        local_copy += 1  # since ints are immutable, local_copy now diverges from self.value
        time.sleep(0.1)
        self.value = local_copy
        # END BLOCK

        logging.info(f'Thread {name}: finishing update')


if __name__ == '__main__':
    logging.basicConfig(format='%(asctime)s: %(message)s', level=logging.INFO, datefmt='%H:%M:%S')

    db = FakeDatabase()
    logging.info(f'Testing update. Initial value: {db.value}')

    with ThreadPoolExecutor(max_workers=2) as executor:
        for idx in range(2):
            executor.submit(db.update, idx)

    logging.info(f'Testing update: Final value: {db.value}')
