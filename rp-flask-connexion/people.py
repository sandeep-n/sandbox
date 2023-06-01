import datetime as dt

from flask import abort, make_response

from config import db
from models import Person, PersonSchema




def read_all():
    """
    Handler for our GET request (to fetch a list of people). 
    """
    people = Person.query.order_by(Person.lname).all()
    person_schema = PersonSchema(many=True)
    data = person_schema.dump(people)
    return data


def read_one(person_id):
    """
    Look up a single person, by ID
    """
    person = Person.query.filter(Person.person_id == person_id).one_or_none()
    if person is not None:
        person_schema = PersonSchema()
        data = person_schema.dump(person)
        return data
    else:
        abort(404, f"Person not found with ID {person_id}")


def create(person):
    """
    Add a new person to the PEOPLE collection
    """
    lname = person.get('lname', None)
    fname = person.get('fname', None)

    existing_person = Person.query.filter(Person.fname == fname).filter(Person.lname == lname).one_or_none()

    if existing_person is None:
        schema = PersonSchema()
        new_person = schema.load(person, session=db.session)
        db.session.add(new_person)
        db.session.commit()
        data = schema.dump(new_person)
        return data, 201
    else:
        abort(406, "Already exists")


def update(person_id, person):
    """
    """
    person_to_update = Person.query.filter(Person.person_id == person_id).one_or_none()
    if person_to_update is None:
        abort(404, "Person not found")    
    else:
        schema = PersonSchema()
        update_data = schema.load(person, session=db.session)
        update_data.person_id = person_to_update.person_id
        db.session.merge(update_data)
        db.session.commit()
        data = schema.dump(person_to_update)
        return data, 200


def delete(person_id):
    """
    _summary_

    :param person_id: _description_
    """
    person = Person.query.filter(Person.person_id == person_id).one_or_none()
    if person is not None:
        db.session.delete(person)
        db.session.commit()
        return make_response(f"Person {person_id} deleted", 200)
    else:
        abort(404, "person not found")
