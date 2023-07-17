example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
example_list.insert(3, 'jackfruit')
example_list.append('strawberry')
example_list.sort()
example_list1 = example_list.copy()
print(example_list1.append(example_list))
print(example_list1[1])
print(example_list1[-1])
print(example_list[2:5])
print(example_list[:2])
print(example_list[5:])
print(example_list1)
example_list1[1] = 'blackcurrent'
print(example_list1)
for item in example_list1:
    print(item)
print(len(example_list1))
# add item at the end of list use append
example_list1.append('Grapes')
print(example_list1)
# insert item at specific index then use insert
example_list1.insert(4, 'Orange')
print(example_list1)
# Reomove item from list use pop
example_list1.pop(8)
print(example_list1)

# remove specific item from list
# example_list1.remove('banana')
print(example_list1)
# join or concatenate two lists
example_list2 = example_list + example_list1
print(example_list2)

example_list = ["apple", "banana", "cherry"]
print(example_list[1])  # Output: "banana"

example_list = ["apple", "banana", "cherry"]
print(example_list[-1])  # Output: "cherry"

# You can specify a range of indexes by specifying where to start and where to end the range.
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[2:5])  # Output: ["cherry", "orange", "kiwi"]

# By leaving out the start value, the range will start at the first item:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[:2])  # Output: ["apple", "banana"]

# By leaving out the end value, the range will go on to the end of the list:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(example_list[5:])  # Output: ["melon", "mango"]
# To change the value of a specific item, refer to the index number:

example_list = ["apple", "banana", "cherry"]
example_list[1] = "blackcurrant"
print(example_list)

# You can loop through the list items by using a for loop:

example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
for item in example_list:
    print(item)

# To add an item to the end of the list, use the append() method:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango", "orange"]
print(example_list)  # Output: ['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon', 'mango', 'orange']
# To add an item at the specified index, use the insert() method:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
example_list.insert(1, "orange")
print(example_list)  # Output: ['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon', 'mango', 'orange']


# The remove() method removes the specified item:
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
example_list.remove("banana")
print(example_list) # Output: ['apple', 'cherry', 'orange', 'kiwi', 'melon', 'mango']

# The pop() method removes the specified index, (or the last item if index is not specified):
example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
example_list.pop()
print(example_list) # Output: ['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon']

# There are ways to make a copy, one way is to use the built-in List method copy().

example_list = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
mylist = example_list.copy()
print(mylist) # Output: ['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon']
print(mylist + example_list)  # output: ['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon', 'mango', 'apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon', 'mango']

#There are several ways to join, or concatenate, two or more lists in Python.
#One of the easiest ways are by using the + operator
list1 = ["Bharat", "Guru", "Lalit","a", "b" , "c"]
list2 = [1, 2, 3]

list3 = list1 + list2
print(list3) # Output: ["Bharat", "Guru", "Lalit","a", "b" , "c", 1, 2, 3]
print(len(list3))

# It is also possible to use the list() constructor to make a new list.
list1 = (("Bharat", "Guru", "Lalit","a", "b" , "c"))
print (list1)

