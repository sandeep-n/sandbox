# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: protobufs/helloworld.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1aprotobufs/helloworld.proto\"\x1c\n\x0cHelloRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\" \n\rHelloResponse\x12\x0f\n\x07message\x18\x01 \x01(\t26\n\x07Greeter\x12+\n\x08SayHello\x12\r.HelloRequest\x1a\x0e.HelloResponse\"\x00\x62\x06proto3')



_HELLOREQUEST = DESCRIPTOR.message_types_by_name['HelloRequest']
_HELLORESPONSE = DESCRIPTOR.message_types_by_name['HelloResponse']
HelloRequest = _reflection.GeneratedProtocolMessageType('HelloRequest', (_message.Message,), {
  'DESCRIPTOR' : _HELLOREQUEST,
  '__module__' : 'protobufs.helloworld_pb2'
  # @@protoc_insertion_point(class_scope:HelloRequest)
  })
_sym_db.RegisterMessage(HelloRequest)

HelloResponse = _reflection.GeneratedProtocolMessageType('HelloResponse', (_message.Message,), {
  'DESCRIPTOR' : _HELLORESPONSE,
  '__module__' : 'protobufs.helloworld_pb2'
  # @@protoc_insertion_point(class_scope:HelloResponse)
  })
_sym_db.RegisterMessage(HelloResponse)

_GREETER = DESCRIPTOR.services_by_name['Greeter']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _HELLOREQUEST._serialized_start=30
  _HELLOREQUEST._serialized_end=58
  _HELLORESPONSE._serialized_start=60
  _HELLORESPONSE._serialized_end=92
  _GREETER._serialized_start=94
  _GREETER._serialized_end=148
# @@protoc_insertion_point(module_scope)