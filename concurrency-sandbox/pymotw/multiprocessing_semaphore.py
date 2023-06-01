"""
Controlling concurrent access to resources: how to allow more than one worker access to a resource while still
limiting the overall number. Example given: connection pool!
"""
import multiprocessing
import random
import time


class ActivePool:
    def __init__(self):
        super().__init__()
        self.mgr = multiprocessing.Manager()
        self.active = self.mgr.list()
        self.lock = multiprocessing.Lock()

    def make_active(self, name):
        with self.lock:
            self.active.append(name)

    def make_inactive(self, name):
        with self.lock:
            self.active.remove(name)

    def __str__(self):
        with self.lock:
            return str(self.active)


def worker(s: multiprocessing.Semaphore, pool: ActivePool) -> None:
    name = multiprocessing.current_process().name
    with s:
        pool.make_active(name)
        print(f'Activating {name} now running {pool}')
        time.sleep(random.random())
        pool.make_inactive(name)


if __name__ == '__main__':
    pool = ActivePool()
    s = multiprocessing.Semaphore(3)
    jobs = [multiprocessing.Process(target=worker, name=str(i), args=(s, pool)) for i in range(10)]

    for j in jobs:
        j.start()

    while True:
        alive = 0
        for j in jobs:
            if j.is_alive():
                alive += 1
                j.join(timeout=0.1)
                print(f'Now running {pool}')
        if alive == 0:
            break
