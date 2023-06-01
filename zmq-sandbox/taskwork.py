import sys
import time
import zmq

context = zmq.Context()

receiver = context.socket(zmq.PULL)  # ventilator
receiver.connect('tcp://localhost:5557')

sender = context.socket(zmq.PUSH)   # sink
sender.connect('tcp://localhost:5558')

while True:
    s = receiver.recv()
    # progress indicator
    sys.stdout.write('.')
    sys.stdout.flush()

    time.sleep(int(s) * 0.001)
    sender.send(b'')
