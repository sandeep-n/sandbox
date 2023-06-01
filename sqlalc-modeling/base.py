from sqlalchemy import MetaData, Column, Integer
from sqlalchemy.ext.declarative import declarative_base

from constants import TEST_SCHEMA

Base = declarative_base(metadata=MetaData(schema=TEST_SCHEMA))


class BarModel(Base):
    __tablename__ = 'bar'
    id = Column(Integer, primary_key=True)

