

import asyncio
from contextlib import contextmanager

import psycopg2


@contextmanager
def loop_with_reader(loop, fd, callback, *args):
    print('Entering the context')
    loop.add_reader(fd, callback, *args)
    yield loop
    print('Exiting the context')
    loop.remove_reader(fd)


def simple_callback(conn: psycopg2.extensions.connection, fut: asyncio.Future):
    try:
        conn.poll()
    except psycopg2.InterfaceError:  # raised when .poll() is called on a closed connection
        raise
    else:
        notify = conn.notifies.pop(0)
        finished_job_id = notify.payload
        print(f'Listener got finished job ID: {finished_job_id}')
        fut.set_result(finished_job_id)


async def main():
    conn = psycopg2.connect(database='abraxas_db', user='abraxas_ro', password='sodium', host='localhost', port=5432)
    loop = asyncio.get_running_loop()
    fut = loop.create_future()
    with loop_with_reader(loop, conn, simple_callback, conn, fut):
        print('Working in context')
        conn.set_isolation_level(psycopg2.extensions.ISOLATION_LEVEL_AUTOCOMMIT)
        with conn.cursor() as cur:
            
            cur.execute('LISTEN job_result_available;')
            awaited_job_id = await fut
            print(f'Awaited job ID: {awaited_job_id}')
    assert loop.remove_reader(conn) is False

if __name__ == '__main__':
    asyncio.run(main())
