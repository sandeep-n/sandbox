from setuptools import find_packages, setup

setup(
    name='bar',
    version='0.1',
    packages=find_packages(include=['baz'], exclude=['foo'])
)
