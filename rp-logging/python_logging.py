"""
1. create custom Logger
2. create Handlers that will represent output destinations
3. attach Formatters to Handlers (each destination can then receive in its own format!)
4. attach Handlers to Logger
"""

import logging

logger = logging.getLogger(__name__)  # __name__ is the name of the current module

stream_handler = logging.StreamHandler()
stream_handler.setLevel(logging.WARNING)
file_handler = logging.FileHandler('file.log')
file_handler.setLevel(logging.ERROR)  # only LogRecords that are ERROR or more severe get logged to the file

stream_format = logging.Formatter('%(name)s - %(levelname)s - %(message)s')
file_format = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')

stream_handler.setFormatter(stream_format)
file_handler.setFormatter(file_format)

logger.addHandler(stream_handler)
logger.addHandler(file_handler)

logger.warning('This is a warning')
logger.error('This is an error')
