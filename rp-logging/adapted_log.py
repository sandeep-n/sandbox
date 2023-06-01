import logging
import os
import random
from types import SimpleNamespace

LOG_REPO = 'rp-logging'

logging.basicConfig(
    level=logging.DEBUG, format='rp-logging - pid:%(process)d - %(name)s - %(levelname)s - %(message)s'
)


logger = logging.getLogger(__name__)
logger.warning('look out!')
