
def add(a, b):
    return a + b


def multiply(a, b):
    product = 0
    for i in range(b):
        product = add(a, product)
    return product


def perform_multiplication(a, b):
    return multiply(a, b)


result = perform_multiplication(2, 3)
print(result)
