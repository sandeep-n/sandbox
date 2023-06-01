import datetime as dt
import time

for x in range(10_000):
    with open('logloglog.log', 'a') as f:
        print(f'{dt.datetime.now().time()} FOO', file=f)
    time.sleep(10)
