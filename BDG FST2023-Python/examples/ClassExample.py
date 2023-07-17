class GFG:
    def __init__(self, name, company):
        self.name = name
        self.company = company

    def __str__(self):
        return f"My name is {self.name} and I work in {self.company}."


my_obj = GFG("Bharat", "IBM")
print(my_obj)


class Dog:
    # Class Variable
    animal = 'dog'

    # The init method or constructor
    def __init__(self, breed):
        # Instance Variable
        self.breed = breed

    # Adds an instance variable
    def setColor(self, color):
        self.color = color

    # Retrieves instance variable
    def getColor(self):
        return self.color


# Driver Code
Rodger = Dog("Puppy")
Rodger.setColor("White")
print(Rodger.getColor())


class Dog:
    # Class Variable
    animal = 'dog'

    # The init method or constructor
    def __init__(self, breed, color):
        # Instance Variable
        self.breed = breed
        self.color = color


# Objects of Dog class
Rodger = Dog("Pug", "brown")
Buzo = Dog("Bulldog", "black")

print('Rodger details:')
print('Rodger is a', Rodger.animal)
print('Breed: ', Rodger.breed)
print('Color: ', Rodger.color)

print('\nBuzo details:')
print('Buzo is a', Buzo.animal)
print('Breed: ', Buzo.breed)
print('Color: ', Buzo.color)

# Class variables can be accessed using class
# name also
print("\nAccessing class variable using class name")
print(Dog.animal)


# Default Constructor
class Addition:
    first = 0
    second = 0
    answer = 0

    # parameterized constructor
    def __init__(self, f, s):
        self.first = f
        self.second = s

    def display(self):
        print("First number = " + str(self.first))
        print("Second number = " + str(self.second))
        print("Addition of two numbers = " + str(self.answer))

    def calculate(self):
        self.answer = self.first + self.second


# creating object of the class
# this will invoke parameterized constructor
obj1 = Addition(1000, 2000)

# creating second object of same class
obj2 = Addition(10, 20)

# perform Addition on obj1
obj1.calculate()

# perform Addition on obj2
obj2.calculate()

# display result of obj1
obj1.display()

# display result of obj2
obj2.display()

# Parameterized Constructor
class MyClass:
    def __init__(self, name=None):
        if name is None:
            print("Default constructor called")
        else:
            self.name = name
            print("Parameterized constructor called with name", self.name)

    def method(self):
        if hasattr(self, 'name'):
            print("Method called with name", self.name)
        else:
            print("Method called without a name")

# Create an object of the class using the default constructor
obj1 = MyClass()

# Call a method of the class
obj1.method()

# Create an object of the class using the parameterized constructor
obj2 = MyClass("Bharat")

# Call a method of the class
obj2.method()
