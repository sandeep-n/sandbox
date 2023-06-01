"""
Polls a "database", creates a Task if there is a viable job in the database.
"""
import asyncio
import datetime as dt
import time

DB_POLLER_TIMEOUT = 1  # second

queueue = dict(zip(range(12), 'abcdefghijkl'))


def peek_queue(q):
    """
    Returns ID of next job
    :return:
    """
    # SQLAlchemy code is asynchronous and can take a beat.
    time.sleep(0.2)
    return queueue[q]


async def job_runner(job: str) -> str:
    """
    `job` is just a string.
    :param job:
    """
    # Simulate some heavy compute
    print(f'Starting experiment of type {job}')
    t = ord(job) - 96  # don't ask
    print(f'Sleeping for {t} seconds')
    await asyncio.sleep(t)
    print(f'Finishing experiment of type {job} with results {job.upper()}')
    return job.upper()


async def poller():
    """
    Mimics querying the database for next job, and if found, creates a Task in the event loop for it.
    :return:
    """
    while True:
        q, r = divmod(dt.datetime.now().second, 5)
        if r == 0:  # seconds is a multiple of 5, check in "database"
            job = await asyncio.get_running_loop().run_in_executor(None, peek_queue, q)
            asyncio.create_task(job_runner(job))
        else:
            print('No suitable jobs in the database.')
        await asyncio.sleep(DB_POLLER_TIMEOUT)


async def main():
    await poller()


if __name__ == '__main__':
    asyncio.run(main())
