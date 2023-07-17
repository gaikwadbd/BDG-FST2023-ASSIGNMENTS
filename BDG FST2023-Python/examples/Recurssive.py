# Recursive function definition
def factorial(n):
    if n==0:
        return 1
    else:
        return n * factorial(n-1)

# Reading number from user
number = int(input('Enter number: '))
# Displaying factorial
if(number< 0):
    print('Factorial does not exist!')
else:
    print('Factorial of %d is %d' %(number,factorial(number)))


# Sum of first n natural numbers using recusrion
# Recursive function definition
def rec_sum(n):
    s = 0
    if n<=0:
        return 0
    return n + rec_sum(n-1)

# Reading number from user
number = int(input('Enter number: '))

# Displaying sum of first n natural numbers
print('Sum of first %d natural numbers is %d' %(number,rec_sum(number)))

# Sum of digit of number using recursion

def sum_of_digit(n):
    if n< 10:
        return n
    else:
        return n%10 + sum_of_digit(n/10)

# Read number
number = int(input("Enter number: "))

# Function call
digit_sum = sum_of_digit(number)

# Display output
print("Sum of digit of number %d is %d." % (number,digit_sum))


# Sum of 1+11+111+... using recursion

def recSum(n):
    if n<=0:
        return 0
    else:
        return (n + 10 * recSum(n-1))

# Reading number of terms
term = int(input("Enter number of terms:"))
series_sum = recSum(term)
print("\nSum of series is: ", series_sum)


# nth term of Fibonacci series using recursion
def fib(n):
    if n==1:
        return 0
    elif n==2:
        return 1
    else:
        return fib(n-1) + fib(n-2)

# Reading number of terms
term = int(input("Which term of Fibonacci series? "))

result = fib(term)
print("\n%dth term of Fibonacci series is: %d" %(term, result))


# Recursive function definition
def power(x,n):
    if n==0:
        return 1
    else:
        return x * power(x, n-1)

# Reading base and exponent
base = float(input("Enter value of base: "))
exponent = int(input("Enter value of exponent: "))

# Function call
result = power(base, exponent)

# Displaying result
print("Result is:", result)