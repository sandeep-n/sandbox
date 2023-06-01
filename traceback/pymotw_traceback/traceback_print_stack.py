import sys
import traceback

from traceback_example import call_function


def f():
    traceback.print_stack(file=sys.stdout)


print('Calling f() directly:')
f()

print('\nCalling f() from down the stack:')
call_function(f)
