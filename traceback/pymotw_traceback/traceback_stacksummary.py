import traceback

from traceback_example import call_function


def f():
    summary = traceback.StackSummary.extract(traceback.walk_stack(None))
    print(''.join(summary.format()))


print(f'Calling f() directly:')
f()

print()
print(f'Calling f() from 3 levels deep:')
call_function(f)
