# Inheriting the properties of the parent class as well as adding new properties of our own to the child class.
# parent class
class Person(object):
    def __init__(self, name):
        self.name = name

    def getName(self):
        return self.name

    def isEmployee(self):
        return False


# Inherited or Subclass (Note Person in bracket)
class Employee(Person):
    def __init__(self, name, eid):
        ''' In Python 3.0+, "super().__init__(name)"
            also works'''
        super(Employee, self).__init__(name)
        self.empID = eid

    def isEmployee(self):
        return True

    def getID(self):
        return self.empID


# Driver code
emp = Employee("Bharat", "C2000020")
print(emp.getName(), emp.isEmployee(), emp.getID())


# Inheritance Example
class Car(object):

    def __init__(self):
        print("You just created the car instance")

    def carStarted(self):
        print("Car started...")

    def carStopping(self):
        print("Car stopped")


class JaguarLandrover(Car):

    def __init__(self):
        Car.__init__(self)
        print("You just created the JaguarLandrover instance")

    def carDriving(self):
        super(JaguarLandrover, self).carStarted()
        print("You are  a Jaguar Land rover, Enjoy...")

    def microprocessorSpeedControler(self):
        print("Microprocessor Speed control is a unique feature")


c = Car()
c.carStarted()
c.carStopping()


b = JaguarLandrover()
b.carDriving()
b.carStopping()
b.microprocessorSpeedControler()
