# Python Program to Reverse Given Number

# Reading Number and Converting to Integer
number = int(input('Enter Number: '))
copy = number

# Set Reverse variable to 0
reverse = 0

# Finding Reverse
while number != 0:
    remainder = number%10
    reverse = reverse *10 + remainder
    number = number//10

# Displaying Reverse
print('Reverse of %d is %d' %(copy, reverse))