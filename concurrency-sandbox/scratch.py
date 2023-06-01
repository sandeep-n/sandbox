

def foo(a, b, c=3, **kwargs):
    print(a, b, c)
    for x in kwargs.values():
        print(x)


if __name__ == '__main__':
    foo(1, 2, d=4, e=5)
