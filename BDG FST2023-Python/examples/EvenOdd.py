# Check Even or Odd
number = int(input("Enter number: "))
if number%2==0:
    print("EVEN")
else:
    print("ODD")

# Check Even or Odd Using Bitwise Operator

number = int(input("Enter number: "))

if number & 1:
    print("ODD")
else:
    print("EVEN")