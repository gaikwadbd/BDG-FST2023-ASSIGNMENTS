""" Code without using the bridge method
	We have a class with three attributes
	named as length, breadth, and height and
	three methods named as ProduceWithAPI1(),
	ProduceWithAPI2(), and expand(). Out of these
	producing methods are implementation-specific
	as we have two production APIs"""

class Cuboid:

    class ProducingAPI1:

        """Implementation Specific Implementation"""

        def produceCuboid(self, length, breadth, height):

            print(f'API1 is producing Cuboid with length = {length}, '
                  f' Breadth = {breadth} and Height = {height}')

    class ProducingAPI2:
        """Implementation Specific Implementation"""

        def produceCuboid(self, length, breadth, height):
            print(f'API2 is producing Cuboid with length = {length}, '
                  f' Breadth = {breadth} and Height = {height}')


    def __init__(self, length, breadth, height):

        """Initialize the necessary attributes"""

        self._length = length
        self._breadth = breadth
        self._height = height

    def produceWithAPI1(self):

        """Implementation specific Abstraction"""

        objectAPIone = self.ProducingAPI1()
        objectAPIone.produceCuboid(self._length, self._breadth, self._height)

    def producewithAPI2(self):

        """Implementation specific Abstraction"""

        objectAPItwo = self.ProducingAPI2()
        objectAPItwo.produceCuboid(self._length, self._breadth, self._height)

    def expand(self, times):

        """Implementation independent Abstraction"""

        self._length = self._length * times
        self._breadth = self._breadth * times
        self._height = self._height * times

# Instantiate a Cuboid
cuboid1 = Cuboid(1, 2, 3)

# Draw it using APIone
cuboid1.produceWithAPI1()

# Instantiate another Cuboid
cuboid2 = Cuboid(19, 20, 21)

# Draw it using APItwo
cuboid2.producewithAPI2()


"""Code implemented with Bridge Method.
We have a Cuboid class having three attributes
named as length, breadth, and height and three
methods named as produceWithAPIOne(), produceWithAPItwo(),
and expand(). Our purpose is to separate out implementation
specific abstraction from implementation-independent
abstraction"""

class ProducingAPI1:

    """Implementation specific Abstraction"""

    def produceCuboid(self, length, breadth, height):

        print(f'API1 is producing Cuboid with length = {length}, '
              f' Breadth = {breadth} and Height = {height}')

class ProducingAPI2:

    """Implementation specific Abstraction"""

    def produceCuboid(self, length, breadth, height):

        print(f'API2 is producing Cuboid with length = {length}, '
              f' Breadth = {breadth} and Height = {height}')

class Cuboid:

    def __init__(self, length, breadth, height, producingAPI):

        """Initialize the necessary attributes
        Implementation independent Abstraction"""

        self._length = length
        self._breadth = breadth
        self._height = height

        self._producingAPI = producingAPI

    def produce(self):

        """Implementation specific Abstraction"""

        self._producingAPI.produceCuboid(self._length, self._breadth, self._height)

    def expand(self, times):

        """Implementation independent Abstraction"""

        self._length = self._length * times
        self._breadth = self._breadth * times
        self._height = self._height * times


"""Instantiate a cuboid and pass to it an
object of ProducingAPIone"""

cuboid1 = Cuboid(1, 2, 3, ProducingAPI1())
cuboid1.produce()

cuboid2 = Cuboid(19, 19, 19, ProducingAPI2())
cuboid2.produce()
