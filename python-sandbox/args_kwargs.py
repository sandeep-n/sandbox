def concatenate(**kwargs):
    result = ""
    print(f'kwargs is of type {type(kwargs)}')
    # Iterating over the Python kwargs dictionary
    for key in kwargs:
        print(f'{key}')
    for arg in kwargs.values():
        result += arg
    return result

print(concatenate(a="Real", b="Python", c="Is", d="Great", e="!"))
