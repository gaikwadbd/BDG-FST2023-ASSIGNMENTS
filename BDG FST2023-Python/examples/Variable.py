myVariable = 5
print(myVariable)  # Output: 5
myVariable = 9
print(myVariable)  # Output: 9
str = "FST May 2023"
print(str)
myVariable = "Bob"
print(myVariable)
myVariable = 10
print(myVariable)
myVariable = 10.5
print(myVariable)

"""
This is a comment
written in
more than just one line
"""
print("Hello, World!")

x = 1  # int
y = 2.8  # float
z = 1j  # complex
print(x, y, z)
print(type(x), type(y), type(z))
a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a)
a = "Hello, World!"
print(a[1])

#SLICING STRINGS
b = "Hello, World!"
print(b[2:5])

a = "Hello, World!"
print(len(a))


a = "Hello, World!"
print(a.lower())

a = "Hello, World!"
print(a.upper())

a = "Hello, World!"
print(a.replace("H", "J"))

a = "Hello, World!"
print(a.split(","))

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x) # True
print(y) # False


a = "Hello"
b = " World"
c = a + b
print(c) # "Hello World"

age = 36
txt = "My name is Bharat, and I am {}"
print(txt.format(age))

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
# Output: I want 3 pieces of item 567 for 49.95 dollars


quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))

# Output: I want to pay 49.95 dollars for 3 pieces of item 567.

a = int(1)   	 # a will be 1
print(a)
b = int(2.8)	 # b will be 2
print(b)
c = int("3") 	 # c will be 3
print(c)

x = float(1)     # x will be 1.0
print(x)
y = float(2.8)   # y will be 2.8
print(y)
z = float("3")   # z will be 3.0
print(z)
w = float("4.2") # w will be 4.2
print(w)

j = str("s1") 	 # j will be 's1'
print(j)
k = str(2)    	 # k will be '2'
print(k)
l = str(3.0)  	 # l will be '3.0'
print(l)