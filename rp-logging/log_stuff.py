import logging

logging.basicConfig(
    level=logging.DEBUG, filename='app.log', filemode='w', format='%(name)s - %(levelname)s - %(message)s'
)


def main():
    a = 5
    b = 0

    try:
        c = a / b
    except Exception as e:
        logging.error('Exception occurred', exc_info=True)


if __name__ == '__main__':
    main()
