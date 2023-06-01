"""
Will be run by systemd timer
"""
import datetime as dt

with open('logloglog.log', 'a') as f:
    print(f'{dt.datetime.now().time()} BARBARBAR', file=f)
