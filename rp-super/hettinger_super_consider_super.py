import logging
from collections import OrderedDict, Counter
from pprint import pprint

logging.basicConfig(level=logging.INFO)


class LoggingDict(dict):
    def __setitem__(self, key, value):
        logging.info(f'Setting {key} to {value}')
        super().__setitem__(key, value)


class LoggingOD(LoggingDict, OrderedDict):
    """
    The remarkable thing about this class is its mro. It goes LoggingOD -> LoggingDict -> OrderedDict -> dict -> object.
    Note how LoggingOD.__setitem__ delegates to OrderedDict, with no change needed to LoggingDict.
    """
    pass


class Root:
    def draw(self):
        assert not hasattr(super(), 'draw')


class Shape(Root):
    def __init__(self, shapename, **kwargs):
        self.shapename = shapename
        super().__init__(**kwargs)

    def draw(self):
        print(f'Drawing. Setting shape to {self.shapename}')
        super().draw()


class ColoredShape(Shape):
    def __init__(self, color, **kwargs):
        self.color = color
        super().__init__(**kwargs)

    def draw(self):
        print(f'Drawing. Setting color to {self.color}')
        super().draw()


class Movable:
    """
    How can we make our shapes moveable? __init__ signature is incompatible with object.__init__
    """
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def draw(self):
        print(f'Drawing at position: {self.x}, {self.y}')


class MovableAdapter(Root):
    """
    Make an adapter!
    """
    def __init__(self, x, y, **kwargs):
        self.movable = Movable(x, y)
        super().__init__(**kwargs)

    def draw(self):
        self.movable.draw()
        super().draw()


class MovableColoredShape(ColoredShape, MovableAdapter):
    pass


class OrderedCounter(Counter, OrderedDict):
    def __repr__(self):
        return f'{self.__class__.__name__}({OrderedDict(self)})'

    def __reduce__(self):
        return self.__class__, (OrderedDict(self), )


if __name__ == '__main__':
    oc = OrderedCounter('abracadabra')
    print(oc)
