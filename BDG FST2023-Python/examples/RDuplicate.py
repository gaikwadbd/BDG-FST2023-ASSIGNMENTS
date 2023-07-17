# Original list
list_with_duplicates = [2,4,5,6,7,2,3,5]
# Removing
list_with_no_duplicates = list(dict.fromkeys(list_with_duplicates))
# Printing
print(list_with_no_duplicates)

# Python program calculates duplicate elements in Python list.
intNumList = ["a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "a"]
dct = {}
for i in intNumList:
    dct[i]=intNumList.count(i)
print(dct)

dct = {i:intNumList.count(i) for i in intNumList}
print(dct)

from collections import Counter
dct = Counter(intNumList)
print(dct)

# This Python example explains how to check whether certain key exist or not in Python dictionary.
dct = {'first':1, 'second':2, 'third':4}

if 'first' in dct:
    print('Key exist!')
else:
    print('Key does not exist!')

if 'second' in dct:
    print('Key exist!')
else:
    print('Key does not exist!')

if 'third' in dct:
    print('Key exist!')
else:
    print('Key does not exist!')

if 'fourth' in dct:
    print('Key exist!')
else:
    print('Key does not exist!')

# Floating Point Accuracy
delta = 1
while delta > 1e-20:
    if 1 + delta == 1:
        print('1 +', delta, "  = 1")
        flag = delta/0.1
        break
    else:
        print('1 +', delta, "  != 1")

    delta=delta*0.1

print("\n\nAccuracy of Python floating point number is: ", flag)