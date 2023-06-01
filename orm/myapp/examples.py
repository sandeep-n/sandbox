from sqlalchemy import create_engine

engine = create_engine('sqlite:////home/sandeep/sandbox/orm/author_book_publisher.db', echo=False)
