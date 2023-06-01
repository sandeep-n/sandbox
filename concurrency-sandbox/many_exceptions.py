class CollectedErrors(Exception):
    pass


def raises_a():
    raise ValueError


def raises_b():
    raise KeyError


def runs():
    return 1


def handler():
    errors = []
    results = []
    for func in [raises_a, raises_b, runs]:
        try:
            x = func()
        except Exception as e:
            errors.append(e)
        else:
            results.append(x)
    if len(errors) > 0:
        raise CollectedErrors(errors)
    else:
        return results


def main():
    try:
        xs = handler()
    except Exception as e:
        print(type(e), e)


if __name__ == '__main__':
    main()
