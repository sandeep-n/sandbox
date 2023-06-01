

def my_decorator(func):
    def wrapper():
        print("prelude")  # something happens before wrapped function is called
        func()
        print("epilogue")  # something happens after wrapped function is called
    return wrapper


def whoop():
    print('yaaah!')


fancy_whoop = my_decorator(whoop)

fancy_whoop()
