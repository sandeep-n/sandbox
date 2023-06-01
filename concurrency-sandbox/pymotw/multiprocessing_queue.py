"""
Effective use of multiple processes usually means some inter-process communication (think the Reduce phase
of MapReduce). A queue is an easy way of achieving this.

All we're doing here is creating a single worker, and passing a single message to it.

Note that multiprocessing.Queue needs objects to be Pickle-serializable.
"""
import multiprocessing


class MyFancyClass:
    def __init__(self, name):
        self.name = name

    def do_something(self):
        proc_name = multiprocessing.current_process().name
        print(f'Doing something fancy in {proc_name} for {self.name}!')


def worker(q):
    obj = q.get()
    obj.do_something()


if __name__ == '__main__':
    queue = multiprocessing.Queue()

    p = multiprocessing.Process(target=worker, args=(queue,))
    p.start()

    queue.put(MyFancyClass('Fancy Dan'))

    queue.close()
    queue.join_thread()
    p.join()
