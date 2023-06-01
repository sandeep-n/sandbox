from flask import Flask
from markupsafe import escape

app = Flask(__name__)

@app.route('/')
def hello_world():
    return '<p>Hello, World!</p>'


@app.route('/upper/<text>')
def upper_case(text):
    return escape(text).upper()

