
from datetime import datetime

    
with open('append.txt', 'a') as f:
    f.write(f'Accessed at {datetime.now()}\n')
