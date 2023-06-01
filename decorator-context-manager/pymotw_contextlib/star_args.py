# sum_integers_args.py
def my_sum(*args):
    result = 0
    # Iterating over the Python args tuple
    for x in args:
        result += x
    return result


def my_sigma(*args):
    """
    simply delegates to my_sum
    """
    return my_sum(*args)


def main():
    print(my_sum(1, 2, 3, 4))
    print(my_sigma(1, 2, 3, 4))


if __name__ == '__main__':
    main()
