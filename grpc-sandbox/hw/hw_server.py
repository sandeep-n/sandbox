import asyncio
import time
from grpclib.utils import graceful_exit
from grpclib.server import Server

from helloworld_grpc import GreeterBase
from helloworld_pb2 import HelloResponse


async def greeting_builder(name):
    print('Generating greeting...')
    await asyncio.sleep(2)
    message = f'Hello, {name}!'
    print('Done generating!')
    return message


class Greeter(GreeterBase):

    async def SayHello(self, stream) -> None:
        request = await stream.recv_message()
        assert request.name != 'Tester'
        greeter_task = asyncio.create_task(greeting_builder(name=request.name))
        await asyncio.sleep(0.1)
        try:
            message = await greeter_task
        except asyncio.CancelledError as e:
            print("Greeter task got cancelled :(")
            print(e)
        else:        
            await stream.send_message(HelloResponse(message=message))


async def main(*, host='localhost', port=50051):
    server = Server([Greeter()])
    with graceful_exit([server]):
        await server.start(host, port)
        print(f'Serving on {host}:{port}')
        await server.wait_closed()


if __name__ == '__main__':
    asyncio.run(main())
