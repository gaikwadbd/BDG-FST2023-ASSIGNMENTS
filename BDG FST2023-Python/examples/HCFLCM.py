# Python program to find hcf (gcd) & lcm

# Defining function to calculate hcf
def find_gcd(a,b):
    gcd = 1
    for i in range(1,a+1):
        if a%i==0 and b%i==0:
            gcd = i
    return gcd

# Reading numbers from user
first = int(input('Enter first number: '))
second = int(input('Enter second number: '))

# Function call & displaying output HCF (GCD)
print('HCF or GCD of %d and %d is %d' %(first, second, find_gcd(first, second)))

# Calculating LCM
lcm = first * second / find_gcd(first, second)
print('LCM of %d and %d is %d' %(first, second, lcm))


# Calculating HCF(GCD) using Euclidean ALgorithm

# Defining function to calculate HCF by Euclidean ALgorithm
def hcf(a,b):
    while b:
        temp = b
        b = a %b
        a = temp
    return a

# Reading numbers from user
first = int(input('Enter first number: '))
second = int(input('Enter second number: '))

# Function call & displaying output HCF (GCD)
print('HCF or GCD of %d and %d is %d' %(first, second, hcf(first, second)))
