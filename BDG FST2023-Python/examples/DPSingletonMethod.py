# Singleton Borg pattern
class Borg:

    # state shared by each instance
    __shared_state = dict()

    # constructor method
    def __init__(self):

        self.__dict__ = self.__shared_state
        self.state = 'FST-May-2023'

    def __str__(self):

        return self.state


# main method
if __name__ == "__main__":

    person1 = Borg() # object of class Borg
    person2 = Borg() # object of class Borg
    person3 = Borg() # object of class Borg

    person1.state = 'Pythod' # person1 changed the state
    person2.state = 'Java'	 # person2 changed the state

    print(person1) # output --> Java
    print(person2) # output --> Java

    person3.state = 'Junit' # person3 changed the
    # the shared state

    print(person1) # output --> Java
    print(person2) # output --> Java
    print(person3) # output --> Junit


# Double Checked Locking singleton pattern
import threading


class SingletonDoubleChecked(object):

    # resources shared by each and every
    # instance

    __singleton_lock = threading.Lock()
    __singleton_instance = None

    # define the classmethod
    @classmethod
    def instance(cls):

        # check for the singleton instance
        if not cls.__singleton_instance:
            with cls.__singleton_lock:
                if not cls.__singleton_instance:
                    cls.__singleton_instance = cls()

        # return the singleton instance
        return cls.__singleton_instance


# main method
if __name__ == '__main__':

    # create class X
    class X(SingletonDoubleChecked):
        pass

    # create class Y
    class Y(SingletonDoubleChecked):
        pass

    A1, A2 = X.instance(), X.instance()
    B1, B2 = Y.instance(), Y.instance()

    assert A1 is not B1
    assert A1 is A2
    assert B1 is B2

    print('A1 : ', A1)
    print('A2 : ', A2)
    print('B1 : ', B1)
    print('B2 : ', B2)
# classic implementation of Singleton Design pattern
class Singleton:

    __shared_instance = 'GeeksforGeeks'

    @staticmethod
    def getInstance():
        """Static Access Method"""
        if Singleton.__shared_instance == 'GeeksforGeeks':
            Singleton()
        return Singleton.__shared_instance

    def __init__(self):
        """virtual private constructor"""
        if Singleton.__shared_instance != 'GeeksforGeeks':
            raise Exception("This class is a singleton class !")
        else:
            Singleton.__shared_instance = self


# main method
if __name__ == "__main__":

    # create object of Singleton Class
    obj = Singleton()
    print(obj)

    # pick the instance of the class
    obj = Singleton.getInstance()
    print(obj)
