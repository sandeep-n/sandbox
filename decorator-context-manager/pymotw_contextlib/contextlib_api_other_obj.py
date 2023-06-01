"""
Demonstrates the with-as idiom.

The context manager's __enter__() method can return an object <-- this is what is referred to by the "as" clause.
"""


class WithinContext:
    def __init__(self, context):
        print(f'WithinContext.__init__({context})')

    def do_something(self):
        print(f'WithinContext.do_something()')

    def __del__(self):
        print('WithinContext.__del__')


class Context:
    def __init__(self):
        print('Context.__init__()')

    def __enter__(self):
        print(f'Context.__enter__()')
        return WithinContext(self)

    def __exit__(self, exc_type, exc_val, exc_tb):
        print('Context.__exit__()')


with Context() as wc:
    wc.do_something()
