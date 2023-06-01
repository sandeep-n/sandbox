import concurrent.futures
import os
import time
from collections import namedtuple

Scientist = namedtuple(typename='Scientist', field_names=['name', 'field', 'born', 'nobel'])

scientists = [
    Scientist(name='Ada Lovelance', field='math', born=1815, nobel=False),
    Scientist(name='Emmy Noether', field='math', born=1882, nobel=False),
    Scientist(name='Marie Curie', field='physics', born=1867, nobel=True),
    Scientist(name='Tu Youyou', field='chemistry', born=1930, nobel=True),
    Scientist(name='Ada Yonath', field='chemistry', born=1939, nobel=True),
    Scientist(name='Vera Rubin', field='astronomy', born=1928, nobel=False),
    Scientist(name='Sally Ride', field='physics', born=1951, nobel=False),
]


def transform(x):
    print(f'Process {os.getpid()} working on record {x.name}')
    time.sleep(1)
    transformed = {'name': x.name, 'age': 2021 - x.born}
    print(f'Process {os.getpid()} done processing record {x.name}')
    return transformed


mp_start = time.time()
with concurrent.futures.ProcessPoolExecutor() as executor:
    # this `result` is now an itertools chain(-like) instead of the list that multiprocessing.Pool.map would give you
    multi_process_result = executor.map(transform, scientists)
mp_end = time.time()

print(f'\nTime to complete process-parallel processing: {mp_end - mp_start:.2f}s\n')
print(list(multi_process_result))

mt_start = time.time()
with concurrent.futures.ThreadPoolExecutor() as executor:
    # this `result` is now an itertools chain(-like) instead of the list that multiprocessing.Pool.map would give you
    multi_thread_result = executor.map(transform, scientists)
mt_end = time.time()

print(f'\nTime to complete thread-parallel processing: {mt_end - mt_start:.2f}s\n')
print(list(multi_thread_result))
