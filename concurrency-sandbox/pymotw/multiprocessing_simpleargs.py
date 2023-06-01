"""
We usually want to be able to pass arguments while spawning a process. These arguments need to be pickle-serializable
(unlike with threading).
"""
import multiprocessing


def worker(num):
    print(f"I'm worker number {num}")


if __name__ == '__main__':
    jobs = []
    for i in range(5):
        process = multiprocessing.Process(target=worker, args=(i,))
        jobs.append(process)
        process.start()
