# Python Program to Find Factorial

# Reading number and converting it to integer type
number = int(input('Enter Number: '))

# Set factorial variable to 1
factorial = 1

# Setting loop to find factorial
for i in range(1, number+1):
    factorial = factorial*i

# Displaying factorial value
print('Factorial of %d is %d' %(number, factorial))