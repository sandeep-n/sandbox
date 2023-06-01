from sqlalchemy import create_engine
from sqlalchemy.sql.ddl import CreateSchema
from sqlalchemy_utils import create_database, drop_database

from base import Base
from constants import TEST_SCHEMA

dialect = 'postgres'
driver = 'psycopg2'
user = 'postgres'
password = 'docker'
database = 'creation_sandbox'
host = 'localhost:5432'


def create_test_database():
    """

    :return:
    """
    engine = create_engine(f"{dialect}+{driver}://{user}:{password}@{host}/{database}")
    create_database(engine.url)
    engine.execute(CreateSchema(TEST_SCHEMA))

    print(f'Tables that Base.metadata knows about: {Base.metadata.tables.keys()}')
    Base.metadata.create_all(engine)


def destroy_test_database():
    """

    :return:
    """
    engine = create_engine(f"{dialect}+{driver}://{user}:{password}@{host}/{database}")
    drop_database(engine.url)
