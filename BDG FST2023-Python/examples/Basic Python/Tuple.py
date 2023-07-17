# Tuple is same like list but they are immutable means you can't change value.


list1 = [19, 24, 38]
print(list1)

list1[-1] = 200
print(list1)

tuple = (11, 22, 33, 22, 12, 67)
print(tuple)
print(tuple[4])
print(tuple[1:])
print(tuple.count(3))
print(tuple.__add__(tuple))

print(list1)