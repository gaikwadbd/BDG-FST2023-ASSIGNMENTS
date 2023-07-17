#This Python source code calculates execution time of current program using time library
import time

def some_function(n):
    for i in range(n):
        pass

start_time = time.time()
n = int(input("Enter positive integer: "))
some_function(n)
end_time = time.time()

print("Execution time is: ", end_time - start_time)
#This Python program prints current username of your computer using
import getpass
print("Current username is: ", getpass.getuser())