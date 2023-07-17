class MyClass:
    'This is an example class'
    x = 5
    def print(self):
        print('This is class example')
p1 = MyClass()
print(p1.x)
p1.print()

class Person:
    'This class represents a person'

    def __init__(self, name, age):
        self.name = name
        self.age = age

p1 = Person("Bharat", 36)

print(p1.name)
print(p1.age)

# My class
class Person:
    'This class represents a person'

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def myFunc(self):
        print("Hello, my name is " + self.name)

p1 = Person("Bharat", 36)
p1.myFunc() # Output: "Hello, my name is Bharat"
p1.name="Mandip"
print(p1.name)
print(p1.age)
p1.myFunc() # output: "Hello, my name is Mandip
del p1
