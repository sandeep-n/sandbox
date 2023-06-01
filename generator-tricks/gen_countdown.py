
def countdown(n):
    while n > 0:
        yield n
        n -= 1


def countup(stop):
    n = 1
    while n < stop:
        yield n
        n += 1
