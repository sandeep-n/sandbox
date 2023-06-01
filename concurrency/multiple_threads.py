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

    threads = []

    for idx in range(3):
        logging.info(f"Main    : create and start thread {idx}.")
        x = threading.Thread(
            target=thread_function,
            args=(idx,)
        )
        threads.append(x)
        x.start()

    for idx, thread in enumerate(threads):
        logging.info(f'Main    : before joining thread {idx}')
        thread.join()
        logging.info(f"Main    : thread {idx} done")
