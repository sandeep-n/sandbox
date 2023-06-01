
from grpclib.client import Channel

from helloworld_grpc import GreeterStub


class GreeterClient:
    def __init__(self, host, port) -> None:
        self.host = host
        self.port = port

    async def _rpc_call(self, call_name, *args):
        async with Channel(self.host, self.port) as channel:
            stub = GreeterStub(channel)
            return await getattr(stub, call_name)(*args)
    
    async def SayHello()