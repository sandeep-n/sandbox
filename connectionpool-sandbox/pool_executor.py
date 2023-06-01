import multiprocessing
import os
os.environ['ABRAXAS_TESTING'] = 'TRUE'

import concurrent.futures
import time

from sqlalchemy import desc

import abraxas.database.utils as db_utils
from abraxas.database.calibration import ExperimentCalibrationData


def slow_reader(n):
    """
    A function that performs a query, and takes its time about it.
    :param n: ignored
    """
    name = 'clock_frequency'

    with db_utils.session_scope('ro') as session:
        cal_values = (
            session.query(ExperimentCalibrationData)
            .filter(ExperimentCalibrationData.name == name,)
            .order_by(desc(ExperimentCalibrationData.created_at))
            .limit(n)
            .all()
        )
        engine = session.get_bind()
        # pool = engine.pool
        print(f"Engine ID {id(engine)} in process {multiprocessing.current_process().name}")
        # time.sleep(3)
        return min(cal_value.created_at for cal_value in cal_values)


def main():
    with concurrent.futures.ProcessPoolExecutor(max_workers=2) as executor:
        timestamps = executor.map(slow_reader, range(1, 8))
    results = list(timestamps)
    print(min(results), max(results))


if __name__ == '__main__':
    db_utils.DB_POOL_SIZE = 2
    db_utils.DB_MAX_OVERFLOW = 0
    main()
