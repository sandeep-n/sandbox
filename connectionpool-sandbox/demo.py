import multiprocessing
import time

from sqlalchemy import desc

import abraxas.database.utils as db_utils
from abraxas.database.calibration import ExperimentCalibrationData


def slow_reader():
    """
    A function that performs a query, and takes its time about it.
    """
    name = 'clock_frequency'

    with db_utils.session_scope('ro') as session:
        cal_value = (
            session.query(ExperimentCalibrationData)
            .filter(ExperimentCalibrationData.name == name,)
            .order_by(desc(ExperimentCalibrationData.created_at))
            .limit(1)
            .one()
        )
        engine = session.get_bind()
        pool = engine.pool
        print(f"Engine ID: {id(engine)}")
        # print()
        print(f"Pool size: {pool.size()} "
              f" Connections in pool: {pool.checkedin()} "
              f"Current Overflow: {pool.overflow()} "
              f"Current Checked out connections: {pool.checkedout()}")
        time.sleep(3)
        print(cal_value.created_at)


def main():
    jobs = []
    for i in range(5):
        p = multiprocessing.Process(target=slow_reader)
        jobs.append(p)
        p.start()
    for p in jobs:
        p.join()


if __name__ == '__main__':
    db_utils.DB_POOL_SIZE = 2
    db_utils.DB_MAX_OVERFLOW = 0
    main()
