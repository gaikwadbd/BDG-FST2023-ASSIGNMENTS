# Defining function to generate Fibonacci series
def generate_fibonacci(n):
    a, b = 0, 1
    while a < n:
        # Print number
        print(a, end=', ')

        # Calculate next term
        next_num = a + b

        # Set a = b & b = next_num
        a, b = b, next_num

# Input
max_term = int(input('Enter maximum term of Fibonacci series: '))

# Function Call
generate_fibonacci(max_term)