"""
A simple example of a request-response usage of ZMQ. 

A server binds its REP (response) socket to a port, and constantly 
receives and sends on that socket. 
"""


import time
import zmq

context = zmq.Context()
socket = context.socket(zmq.REP)
socket.bind('tcp://*:5555')

while True:
    message = socket.recv()
    print(f'Received request: {message}')

    time.sleep(1)

    socket.send_string('World')
