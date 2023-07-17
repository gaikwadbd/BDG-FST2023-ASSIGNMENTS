# A Python program to demonstrate inheritance
class Person(object):

    # Constructor
    def __init__(self, name, id):
        self.name = name
        self.id = id

    # To check if this person is an employee
    def Display(self):
        print(self.name, self.id)


# Driver code
emp = Person("Bharat", 20004)  # An Object of Person
emp.Display()


class Emp(Person):
    def Print(self):
        print("Emp class called")


Emp_details = Emp("Bharat", 20002)

# calling parent class function
Emp_details.Display()

# Calling child class function
Emp_details.Print()
Emp_details.Display()


# Python code to demonstrate how parent constructors are called.
# parent class
class Person(object):

    # __init__ is known as the constructor
    def __init__(self, name, idnumber):
        self.name = name
        self.idnumber = idnumber

    def display(self):
        print(self.name)
        print(self.idnumber)


# child class
class Employee(Person):
    def __init__(self, name, idnumber, salary, post):
        self.salary = salary
        self.post = post

        # invoking the __init__ of the parent class
        Person.__init__(self, name, idnumber)


# creation of an object variable or an instance
a = Employee('Bharat', 200001, 250002111, "Consultant")
# calling a function of the class Person using its instance
a.display()


# Example: super() function with simple Python inheritance
# parent class
class Person():
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print(self.name, self.age)


# child class
class Student(Person):
    def __init__(self, name, age):
        self.sName = name
        self.sAge = age
        # inheriting the properties of parent class
        super().__init__('Bharat D', age)

    def displayInfo(self):
        print(self.sName, self.sAge)


obj = Student("Bharat", 50)
obj.display()
obj.displayInfo()


# Inheritance Eaxmple
class Car(object):

    def __init__(self):
        print("You just created the car instance")

    def drive(self):
        print("Car started...")

    def stop(self):
        print("Car stopped")


class BMW(Car):

    def __init__(self):
        Car.__init__(self)
        print("You just created the BMW instance")


c = Car()
c.drive()
c.stop()

b = BMW()
b.drive()
b.stop()

