"""
Imports and configures some stuff
"""

import os
import connexion
from flask_marshmallow import Marshmallow
from flask_sqlalchemy import SQLAlchemy


basedir = os.path.abspath(os.path.dirname(__file__))

connex_app = connexion.App(__name__, specification_dir=basedir)

app = connex_app.app  # the underlying Flask app instance

sqlite_url = "sqlite:///" + os.path.join(basedir, "people.db")

app.config["SQLALCHEMY_ECHO"] = True
app.config["SQLALCHEMY_DATABASE_URI"] = sqlite_url
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

db = SQLAlchemy(app)

# integrate marshmallow with the Flask app; needs to be done after the SQLAlchemy initialization above
ma = Marshmallow(app)
