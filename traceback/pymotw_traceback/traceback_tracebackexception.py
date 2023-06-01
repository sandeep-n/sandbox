import sys
import traceback

from traceback_example import produce_exception

print('with no exception:')
exc_type, exc_value, exc_tb = sys.exc_info()
tbe = traceback.TracebackException(exc_type, exc_value, exc_tb)
print(''.join(tbe.format()))

print()
print('with exception:')

try:
    produce_exception()
except Exception as e:
    exc_type, exc_value, exc_tb = sys.exc_info()
    tbe = traceback.TracebackException(exc_type, exc_value, exc_tb)
    print(''.join(tbe.format()))
    print('\nexception only:')  # i.e., not the full traceback
    print(''.join(tbe.format_exception_only()))
