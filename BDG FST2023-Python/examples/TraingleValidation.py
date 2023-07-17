# Validity of Triangle given sides

# Function definition to check validity
def is_valid_triangle(a,b,c):
    if a+b>=c and b+c>=a and c+a>=b:
        return True
    else:
        return False

# Reading Three Sides
side_a = float(input('Enter length of side a: '))
side_b = float(input('Enter length of side b: '))
side_c = float(input('Enter length of side c: '))

# Function call & making decision

if is_valid_triangle(side_a, side_b, side_c):
    print('Triangle is Valid.')
else:
    print('Triangle is Invalid.')

# Validity of Triangle given angles

# Function definition to check validity
def is_valid_triangle(a,b,c):
    if a+b+c==180 and a!=0 and b!=0 and c!=0:
        return True
    else:
        return False

# Reading Three Angles
angle_a = float(input('Enter angle a: '))
angle_b = float(input('Enter angle b: '))
angle_c = float(input('Enter angle c: '))

# Function call & making decision
if is_valid_triangle(angle_a, angle_b, angle_c):
    print('Triangle is Valid.')
else:
    print('Triangle is Invalid.')


# Validity of Triangle given sides

# Function definition to check validity
def is_valid_triangle(a,b,c):
    if a+b>=c and b+c>=a and c+a>=b:
        return True
    else:
        return False

# Function definition for type
def type_of_triangle(a,b,c):
    if a==b and b==c:
        print('Triangle is Equilateral.')
    elif a==b or b==c or a==c:
        print('Triangle is Isosceles.')
    else:
        print('Triangle is Scalane')

# Reading Three Sides
side_a = float(input('Enter length of side a: '))
side_b = float(input('Enter length of side b: '))
side_c = float(input('Enter length of side c: '))

# Function call & making decision
if is_valid_triangle(side_a, side_b, side_c):
    type_of_triangle(side_a, side_b, side_c)
else:
    print('Tringle is not possible from given sides.')

