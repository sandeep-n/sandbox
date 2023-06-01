"""
Example of a PUSH/PULL pattern. Unlike a PUB sub, this is for distributed 
task processing. 
"""

import random
import time
import zmq


context = zmq.Context()

sender = context.socket(zmq.PUSH)
sender.bind('tcp://*:5557')

sink = context.socket(zmq.PUSH)
sink.connect('tcp://localhost:5558')

print('Press enter when the workers are ready: ')
_ = input()
print('Sending tasks to workers...')

sink.send(b'0')  # signals start of batch

random.seed()

total_msec = 0

for task_idx in range(100):
    workload = random.randint(1, 100)
    total_msec += workload
    sender.send_string(f'{workload}')

print(f'Total expected cost: {total_msec} msec')

time.sleep(1)
