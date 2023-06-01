from sqlalchemy import Integer, Column

from base import Base


class FooModel(Base):
    __tablename__ = 'foo'
    id = Column(Integer, primary_key=True)
