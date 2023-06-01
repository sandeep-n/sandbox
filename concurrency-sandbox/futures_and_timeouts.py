
import asyncio
import time


async def complete_future(fut):
    time.sleep(2)
    fut.set_result([1, 3, 5])
    

async def main():
    loop = asyncio.get_running_loop()
    fut = loop.create_future()
    


if __name__ == '__main__':
    asyncio.run(main())