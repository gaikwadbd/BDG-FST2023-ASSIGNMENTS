# Python program to check Triangular Number

# Function to check Triangular

def is_triangular(n):

    if n==0 or n==1:
        return True

    triangular_sum = 0

    for i in range(n):
        triangular_sum += i

        if triangular_sum == n:
            return True

        if i == n:
            return False


# Reading number
number = int(input('Enter number: '))

# Making decision
if is_triangular(number):
    print('%d is TRIANGULAR.' %(number))
else:
    print('%d is NOT TRIANGULAR.' %(number))