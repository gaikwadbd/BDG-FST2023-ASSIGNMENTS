# Examples to show available string methods in python
# Accessing characters in a string
# index starts from zero
country = "India"[0]
city = "Pune"
print(country)
ct = city[0]
print(ct)

"""
len()
lower()
upper()
str()
"""

string = "THis is Full STACK TeStEr"
print(string.lower())
print(string.upper())
print(len(string))

print(string + str(11222))

"""
Concatenation
"""
print("Hello " + " " + " Indians !!!")
print(country + " " + city)

# String Manipulations

# Replace Method
string = "1abc2abc3abc4abc"
print(string.replace('abc', 'ABC'))

# Sub-Strings
# starting index is inclusive
# Ending index is exclusive
substring = string[1:6]  # out put abc2a
str = string[1:6:2]  # out put aca

print("****************")

print(substring)
print(str)

# String formatting

city = 'Mumbai'
program = 'City Ride'
print('Welcome to' + city + ' ' + 'lets enjoy the'+ ' ' + program)
print('Welcome to %s' % city)
print('Welcome to %s and enjoy the %s' % (city, program))
