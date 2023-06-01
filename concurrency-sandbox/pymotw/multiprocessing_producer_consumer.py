"""
Illustrates the producer-consumer pattern.

Also shows the poison pill pattern.
"""
import multiprocessing
import time


class Consumer(multiprocessing.Process):

    def __init__(self, task_queue, result_queue):
        super().__init__()
        self.task_queue = task_queue
        self.result_queue = result_queue

    def run(self) -> None:
        proc_name = self.name
        while True:
            next_task = self.task_queue.get()
            if next_task is None:  # this is the poison pill value
                print(f'{proc_name}: exiting!')
                self.task_queue.task_done()
                break
            else:
                print(f'{proc_name}: {next_task}')
                answer = next_task()
                self.task_queue.task_done()
                self.result_queue.put(answer)


class Task:

    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __call__(self, *args, **kwargs):
        time.sleep(0.1)
        return f'{self.a} * {self.b} = {self.a * self.b}'

    def __str__(self):
        return f'{self.a} * {self.b}'


if __name__ == '__main__':
    tasks = multiprocessing.JoinableQueue()
    results = multiprocessing.Queue()

    num_consumers = multiprocessing.cpu_count() * 2
    print(f'Creating {num_consumers} consumers')
    consumers = [Consumer(tasks, results) for i in range(num_consumers)]
    for w in consumers:
        w.start()

    num_jobs = 10
    for i in range(num_jobs):
        tasks.put(Task(i, i))

    for i in range(num_consumers):
        tasks.put(None)

    tasks.join()

    while num_jobs > 0:
        result = results.get()
        print(f'Result: {result}')
        num_jobs -= 1
