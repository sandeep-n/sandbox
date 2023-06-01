from itertools import cycle


async def stuff():
    return 0x10, 0x20, 0x30


def py34_coro():
    """
    Generator-based coroutine
    """
    s = yield from stuff()
    return s


async def py35_coro():
    """
    Native coroutine
    """
    s = await stuff()
    return s


def endless():
    # "yield from" is syntactic sugar for "for i in x(): yield i"
    yield from cycle((9, 8, 7, 6))
