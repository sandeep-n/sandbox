from crontab import CronTab

with CronTab(user='sandeep') as cron:
    job = cron.new(command='/home/sandeep/miniconda3/bin/python /home/sandeep/sandbox/py-crontab/example1.py')
    job.minute.every(1)

