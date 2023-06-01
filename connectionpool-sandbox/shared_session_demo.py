import multiprocessing
import random
import time

from sqlalchemy import desc, asc

import abraxas.database.utils as db_utils
from abraxas.database.calibration import ExperimentCalibrationData


def slow_reader(session):
    """
    A function that performs a query, and takes its time about it.
    """
    name = 'clock_frequency'

    engine = session.get_bind()
    pool = engine.pool
    conn = session.connection()
    print(
        f'process: {multiprocessing.current_process().name}, '
        f'session: {id(session)}, '
        f'engine: {id(engine)}, '
        f'pool: {id(pool)}, '
        f'connection: {id(conn)}'
    )
    print(pool.status())

    cal_values = (
        session.query(ExperimentCalibrationData)
        .order_by(
            desc(ExperimentCalibrationData.created_at)
            if random.random() > 0.5
            else asc(ExperimentCalibrationData.created_at)
        )
        .all()
    )
    time.sleep(1)
    print(f'Number of calibrations: {len(cal_values)}')


def main():
    jobs = []
    with db_utils.session_scope('ro') as session:
        for i in range(10):
            p = multiprocessing.Process(target=slow_reader, args=(session,))
            jobs.append(p)
            p.start()
        for p in jobs:
            p.join()


if __name__ == '__main__':
    db_utils.DB_POOL_SIZE = 2
    db_utils.DB_MAX_OVERFLOW = 0
    main()
