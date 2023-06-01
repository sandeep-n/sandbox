import asyncio
import logging
import time

import zmq
import zmq.asyncio
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
rp_logging_format = logging.Formatter('async-rp-logging - pid:%(process)d - %(name)s - %(levelname)s - %(message)s')


async def main():
    # with zmq.asyncio.Context() as ctx:
    # set up ZMQ handler
    ctx = zmq.Context()
    pub_socket = ctx.socket(zmq.PUB)
    pub_socket.connect(f'tcp://{LOG_PUB_INTERFACE}:{LOG_PUB_PORT}')
    zmq_handler = PUBHandler(pub_socket)
    zmq_handler.setFormatter(rp_logging_format)
    zmq_handler.setLevel(LOG_LEVEL)

    # attach to root logger; child loggers will propagate to root_logger's handlers
    root_logger = logging.getLogger('')
    root_logger.addHandler(zmq_handler)
    for _ in range(5):
        # root_logger.warning('look out!')
        _log.warning('look out!')
        time.sleep(2)
    print('Done')


if __name__ == '__main__':
    asyncio.run(main())
