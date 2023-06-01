import asyncio

from grpclib.client import Channel

from helloworld_pb2 import HelloRequest, HelloResponse
from helloworld_grpc import GreeterStub


async def main():
    async with Channel('127.0.0.1', 50051) as channel:
        greeter = GreeterStub(channel)
        name = 'Dr. Strange'  # try 'Tester' to cause an exception
        try:
            reply = await asyncio.wait_for(greeter.SayHello(HelloRequest(name=name)), 1)
            # reply = await greeter.SayHello(HelloRequest(name=name))
        except Exception as e:
            print('Here comes the exception...')
            print(type(e))
            print(e)
        else:
            print(reply)


if __name__ == '__main__':
    asyncio.run(main())
