import logging
import threading
import time


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
    x = threading.Thread(
        target=thread_function,
        args=(1, ),
        # daemon=True,
    )
    logging.info(f'Main    : before creating thread')
    x.start()
    logging.info(f'Main    : wait for thread to finish')
    # x.join()
    logging.info(f'Main    : all done')
