from crontab import CronTab
cron = CronTab(user='01979D744')
job = cron.new(command='echo hello_world')
job.minute.every(1)
cron.write()