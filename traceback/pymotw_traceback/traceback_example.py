import sys


def produce_exception(recursion_level=2):
    """
    Simulates raising an exception a few frames up the stack from here
    :param recursion_level:
    :return:
    """
    sys.stdout.flush()
    if recursion_level > 0:
        produce_exception(recursion_level - 1)
    else:
        raise RuntimeError()


def call_function(f, recursion_level=2):
    """
    Simulates calling function f a few frames up the stack from here
    :param f:
    :param recursion_level:
    :return:
    """
    if recursion_level > 0:
        return call_function(f, recursion_level - 1)
    else:
        return f()
