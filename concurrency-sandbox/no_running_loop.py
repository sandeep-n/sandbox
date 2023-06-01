"""
Hypothesis: there is no Event Loop created automatically when a Python program is run.
Test by: attempting to get the running event loop in the main thread.
Output: if the hypothesis is correct, should print a message saying that there is no running event loop.
"""

import asyncio


def main():
    try:
        current_loop = asyncio.get_running_loop()
    except RuntimeError as e:
        print(e)


if __name__ == '__main__':
    main()
    