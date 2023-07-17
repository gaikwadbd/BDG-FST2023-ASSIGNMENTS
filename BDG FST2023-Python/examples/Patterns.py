# Generating Right Angle Triangle Pattern Using Stars
row = int(input('Enter number of rows required: '))

for i in range(row):
    for j in range(i+1):
        print('*',end=' ')
    print()

 # Hollow Right Angle Triangle Pattern Using Stars

row = int(input('Enter number of rows required: '))

for i in range(row):
    for j in range(i+1):
        if j==0 or j==i or i==row-1:
            print('*',end=" ")
        else:
            print(" ", end=" ")
    print()

# Generating Pyramid Pattern Using Stars

row = int(input('Enter number of rows required: '))

for i in range(row):
    for j in range(row-i):
        print(' ', end='') # printing space required and staying in same line

    for j in range(2*i+1):
        print('*',end='') # printing * and staying in same line
    print() # printing new line


# Generating Hollow Pyramid Pattern Using Stars

row = int(input('Enter number of rows required: '))

for i in range(row):
    for j in range(row-i):
        print(' ', end='') # printing space required and staying in same line

    for j in range(2*i+1):
        if j==0 or j==2*i or i==row-1:
            print('*',end='')
        else:
            print(' ', end='')
    print() # printing new line

# Generating Inverse Pyramid Pattern Using Stars

row = int(input('Enter number of rows required: '))

for i in range(row,0,-1):
    for j in range(row-i):
        print(' ', end='') # printing space and staying in same line

    for j in range(2*i-1):
        print('*',end='') # printing * and staying in same line
    print() # printing new line


    # Pattern 1-121-12321 pyramid pattern

# Reading number of rows
row = int(input('Enter how many lines? '))

# Generating pattern
for i in range(1,row+1):

    # for space
    for j in range(1, row+1-i):
        print(' ', end='')

    # for increasing pattern
    for j in range(1,i+1):
        print(j, end='')

    # for decreasing pattern
    for j in range(i-1,0,-1):
        print(j, end='')

    # Moving to next line
    print()

# Program to print 1-10-101-1010

n = int(input("Enter number of lines of pattern: "))

for i in range(1,n+1):
    for j in range(1, i+1):
        print(j%2, end="")
    print()


# Program to print 0-01-010-0101

n = int(input("Enter number of lines of pattern: "))

for i in range(1,n+1):
    for j in range(1, i+1):
        print((j+1)%2, end="")
    print()



# Program to print 1-101-10101

n = int(input("Enter number of lines of pattern: "))

for i in range(1,n+1):
    for j in range(1, n-i+1):
        print(" ", end="")

    for k in range(1,2*i):
        print(k%2, end="")

    print()


# Program to print 0-010-01010

n = int(input("Enter number of lines of pattern: "))

for i in range(1,n+1):
    for j in range(1, n-i+1):
        print(" ", end="")
    for k in range(1,2*i):
        print((k+1)%2, end="")
    print()

# Python Program to Generate Flag of Nepal

# Generating Triangle Shape
def triangleShape(n):
    for i in range(n):
        for k in range(i+1):
            print('*',end=' ')
        print()

# Generating Pole Shape
def poleShape(n):
    for i in range(n):
        print('*')

# Input and Function Call
row = int(input('Enter number of rows: '))
triangleShape(row)
triangleShape(row)
poleShape(row)


# Pascle Triangle

row = int(input("Enter number of rows: "))

space = 36

# empty list containg all 0s
a = [0] * 20


print("\n\t\t\t\t*** PASCAL TRIANGLE ***\n")
for i in range(row):

    for spi in range(1,space+1):
        print(" ", end="")

    a[i] = 1

    for j in range(i+1):
        print('%6d' %(a[j]), end = "")

    for j in range(i,0,-1):
        a[j] = a[j] + a[j-1]

    space = space - 3

    print()