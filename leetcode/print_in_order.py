import time
from concurrent.futures import ThreadPoolExecutor
from threading import Lock


def printFirst():
    print('first')
    return 'first'


def printSecond():
    print('second')
    return 'second'


def printThird():
    print('third')
    return 'third'


class Foo:
    def __init__(self):
        self.timeout = 1e-6
        self.counter = 0
        self.lock = Lock()

    def update(self):
        with self.lock:
            self.counter += 1

    def first(self, printFirst: 'Callable[[], None]') -> None:
        # self.update()
        # printFirst() outputs "first". Do not change or remove this line.
        printFirst()
        self.counter += 1

    def second(self, printSecond: 'Callable[[], None]') -> None:
        while self.counter == 0:
            time.sleep(self.timeout)
        # self.update()
        # printSecond() outputs "second". Do not change or remove this line.
        printSecond()
        self.counter += 1

    def third(self, printThird: 'Callable[[], None]') -> None:
        while self.counter <= 1:
            time.sleep(self.timeout)
        # printThird() outputs "third". Do not change or remove this line.
        printThird()


if __name__ == '__main__':
    foo = Foo()
    executors_list = []
    with ThreadPoolExecutor(max_workers=2) as executor:
        executors_list.append(executor.submit(foo.first, printFirst))
        executors_list.append(executor.submit(foo.second, printSecond))
        executors_list.append(executor.submit(foo.third, printThird))
    print(executors_list)
    for x in executors_list:
        print(x.result())
