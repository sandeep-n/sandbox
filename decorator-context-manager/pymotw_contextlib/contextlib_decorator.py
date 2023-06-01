import contextlib


class Context(contextlib.ContextDecorator):

    def __init__(self, how_used):
        self.how_used = how_used
        print(f'__init__({how_used})')

    def __enter__(self):
        print(f'__enter__({self.how_used})')
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        print(f'__exit__({self.how_used})')


@Context('as decorator')
def func(msg):
    print(msg)


print()

with Context('as context manager'):
    print('Doing work in the context')


print()

func('Doing work in the wrapped function')
