x=0
try:
    print(x)
except:
    print('An exception occured')
try:
    print(x)
except NameError:
    print("Variable x is not defined")
except:
    print("Something else went wrong")

try:
    print("Hello")
except:
    print("Something went wrong")
else:
    print("Nothing went wrong")
try:
    print(x)
except:
    print("Something went wrong")
finally:
    print("The 'try except' is finished")


x = 5
y = "hello"
try:
    z = x + y
except TypeError:
    print("Error: cannot add an int and a str")


# Python program to handle simple runtime error
#Python 3

a = [1, 2, 3]
try:
    print ("Second element = %d" %(a[1]))

    # Throws error since there are only 3 elements in array
    print ("Fourth element = %d" %(a[3]))

except:
    print ("An error occurred")


# Program to handle multiple errors with one
# except statement
# Python 3

def fun(a):
    if a < 4:

        # throws ZeroDivisionError for a = 3
        b = a/(a-3)

    # throws NameError if a >= 4
    print("Value of b = ", b)

try:
    fun(3)
    fun(5)

# note that braces () are necessary here for
# multiple exceptions
except ZeroDivisionError:
    print("ZeroDivisionError Occurred and Handled")
except NameError:
    print("NameError Occurred and Handled")
# Program to depict else clause with try-except
# Python 3
# Function which returns a/b
def AbyB(a , b):
    try:
        c = ((a+b) / (a-b))
    except ZeroDivisionError:
        print ("a/b result in 0")
    else:
        print (c)

# Driver program to test above function
AbyB(2.0, 3.0)
AbyB(3.0, 3.0)


# Python program to demonstrate finally

# No exception Exception raised in try block
try:
    k = 5//0 # raises divide by zero exception.
    print(k)

# handles zerodivision exception
except ZeroDivisionError:
    print("Can't divide by zero")

finally:
    # this block is always executed
    # regardless of exception generation.
    print('This is always executed')
# Program to depict Raising Exception

try:
    raise NameError("Hi there") # Raise Error
except NameError:
    print ("An exception")
    raise # To determine whether the exception was raised or not


# Exception Handling using Decorator
import logging
from functools import wraps


def create_logger():

    #create a logger object
    logger = logging.getLogger('exc_logger')
    logger.setLevel(logging.INFO)

    #create a file to store all the
    # logged exceptions
    logfile = logging.FileHandler('exc_logger.log')

    fmt = '%(asctime)s - %(name)s - %(levelname)s - %(message)s'
    formatter = logging.Formatter(fmt)

    logfile.setFormatter(formatter)
    logger.addHandler(logfile)

    return logger


logger = create_logger()

# you will find a log file
# created in a given path
print(logger)


def exception(logger):

    # logger is the logging object
    # exception is the decorator objects
    # that logs every exception into log file
    def decorator(func):

        @wraps(func)
        def wrapper(*args, **kwargs):

            try:
                return func(*args, **kwargs)

            except:
                issue = "exception in "+func.__name__+"\n"
                issue = issue+"-------------------------\
				------------------------------------------------\n"
                logger.exception(issue)
            raise


        return wrapper
    return decorator


@exception(logger)
def divideStrByInt():
    return "krishna"/7

# Driver Code
if __name__ == '__main__':
    divideStrByInt()

# Python program to execute
# time of a program

# importing time module
from time import time
class Timer:

    def __init__(self, func):
        self.function = func

    def __call__(self, *args, **kwargs):
        start_time = time()
        result = self.function(*args, **kwargs)
        end_time = time()
        print("Execution took {} seconds".format(end_time-start_time))
        return result
# adding a decorator to the function
@Timer
def some_function(delay):
    from time import sleep

    # Introducing some time delay to
    # simulate a time taking function.
    sleep(delay)

some_function(3)


# Python program checking
# error parameter using
# class decorator

class ErrorCheck:

    def __init__(self, function):
        self.function = function

    def __call__(self, *params):
        if any([isinstance(i, str) for i in params]):
            raise TypeError("parameter cannot be a string !!")
        else:
            return self.function(*params)


@ErrorCheck
def add_numbers(*numbers):
    return sum(numbers)

# returns 6
print(add_numbers(1, 2, 3))

# raises Error.
print(add_numbers(1, '2', 3))
