import asyncio
import logging
import time

import zmq
from zmq.log.handlers import PUBHandler

LOG_PUB_INTERFACE = '127.0.0.1'
LOG_PUB_PORT = 6666
LOG_LEVEL = logging.DEBUG


_log = logging.getLogger(__name__)


# @asynccontextmanager
# async def configure_logging(log_to_stdout=False):
#     context = zmq.asyncio.Context()
#     pub_socket = context.socket(zmq.PUB)
#     pub_socket.connect(f'tcp://{}')

# our custom log format
rp_logging_format = logging.Formatter('rp-logging - pid:%(process)d - %(name)s - %(levelname)s - %(message)s')

# set up ZMQ handler
context = zmq.Context()
pub_socket = context.socket(zmq.PUB)
pub_socket.connect(f'tcp://{LOG_PUB_INTERFACE}:{LOG_PUB_PORT}')
zmq_handler = PUBHandler(pub_socket)
zmq_handler.setFormatter(rp_logging_format)
zmq_handler.setLevel(LOG_LEVEL)

# attach to root logger
root_logger = logging.getLogger('')
root_logger.addHandler(zmq_handler)

for _ in range(5):
    root_logger.warning('look out!')
    _log.warning('look out!')
    # print('look out!')
    time.sleep(0.3)
