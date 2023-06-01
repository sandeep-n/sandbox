"""
Example of a PUB/SUB pattern. 
Server binds a PUB socket to port 5556. 
"""

import zmq
from random import randrange


context = zmq.Context()
socket = context.socket(zmq.PUB)
socket.bind('tcp://*:5556')

while True:
    zipcode = randrange(94000, 94200)
    temperature = randrange(-80, 135)
    rel_humidity = randrange(10, 60)

    socket.send_string(f'{zipcode} {temperature} {rel_humidity}')
