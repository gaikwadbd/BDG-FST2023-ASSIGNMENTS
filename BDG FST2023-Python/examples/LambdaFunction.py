# Factorial
x = lambda num : 1 if num <= 1 else num*x(num-1)
number = int(input('Enter number: '))
print('%d != %d' %(number, x(number)))

# using Reduce Function

from functools import reduce
number = int(input('Enter number: '))
factorial = reduce(lambda x, y: x * y, range(1, number+1))
print('%d != %d' %(number, factorial))

# Using Lambda function and Reduce
from functools import reduce
number = int(input('Enter number: '))
Factorial = lambda number: reduce(lambda x, y: x * y, range(1, number+1))
print('%d != %d' %(number, Factorial(number)))