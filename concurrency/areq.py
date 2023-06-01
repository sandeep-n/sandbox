import logging
import re
import sys

from aiohttp import ClientSession, ClientError
from aiohttp.http_exceptions import HttpProcessingError

urls = """
https://regex101.com/
https://docs.python.org/3/this-url-will-404.html
https://www.nytimes.com/guides/
https://www.mediamatters.org/
https://1.1.1.1/
https://www.politico.com/tipsheets/morning-money
https://www.bloomberg.com/markets/economics
https://www.ietf.org/rfc/rfc2616.txt
""".split()


logging.basicConfig(
    format='%(asctime)s %(levelname)s:%(name)s: %(message)s',
    level=logging.DEBUG,
    datefmt='%H:%M:%S',
    stream=sys.stderr
)
logger = logging.getLogger('areq')
logging.getLogger('chardet.charsetprober').disabled = True

HREF_RE = re.compile(r'href="(.*?)"')


async def fetch_html(url: str, session: ClientSession, **kwargs) -> str:
    resp = await session.request(method='GET', url=url, **kwargs)
    resp.raise_for_status()
    logger.info(f'Got response [{resp.status}] for URL {url}')
    html = await resp.text()
    return html


async def parse(url: str, session: ClientSession, **kwargs) -> set:
    """
    Searches the URL's HTML string for links
    """
    found = set()
    try:
        html = await fetch_html(url=url, session=session, **kwargs)
    except (ClientError, HttpProcessingError) as e:
        logger.error(f'aiohttp exception for {url} [{getattr(e, "status", None)}]: {getattr(e, "message", None)}')
        return found
