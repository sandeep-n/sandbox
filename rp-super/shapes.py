class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

    def perimeter(self):
        return 2 * (self.length + self.width)


class Square(Rectangle):
    def __init__(self, side):
        # two usages below are equivalent
        # super().__init__(length=side, width=side)
        super(Square, self).__init__(side, side)


class VolumeMixin:
    """
    Mixins are like interfaces in Java.
    """
    def volume(self):
        return self.area() * self.height


class Cube(VolumeMixin, Square):
    def __init__(self, side):
        super().__init__(side)
        self.height = side

    def surface_area(self):
        face_area = super().area()
        return 6 * face_area


class Triangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def tri_area(self):
        return (self.base * self.height) / 2


class RightPyramid(Square, Triangle):
    def __init__(self, base, slant_height):
        self.base = base
        self.slant_height = slant_height
        super().__init__(self.base)

    def area(self):
        base_area = super().area()
        perimeter = super().perimeter()
        return 0.5 * perimeter * self.slant_height + base_area


if __name__ == '__main__':
    cube = Cube(6)
    print(cube.volume())
