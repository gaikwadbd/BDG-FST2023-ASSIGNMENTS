# Counting digit in number

# Defining function to count digit
def count_digit(n):
    count = 0
    while n:
        n //= 10
        count += 1

    return count

# Reading number
number = int(input('Enter number: '))

# Displaying result
print('Number of digit in %d is %d.' %(number, count_digit(number)))