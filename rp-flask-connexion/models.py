import datetime as dt
from config import db, ma


class Person(db.Model):
    """
    SQLAlchemy model class, per yoozh
    """
    __tablename__ = "person"
    person_id = db.Column(db.Integer, primary_key=True)
    lname = db.Column(db.String(32))
    fname = db.Column(db.String(32))
    timestamp = db.Column(db.DateTime, default=dt.datetime.utcnow, onupdate=dt.datetime.utcnow)


class PersonSchema(ma.SQLAlchemyAutoSchema):
    """
    Helps with JSON serialization and deserialization.
    """
    class Meta:
        model = Person
        load_instance = True
