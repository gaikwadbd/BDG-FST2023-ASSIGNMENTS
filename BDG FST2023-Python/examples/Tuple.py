example_tuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(example_tuple)
print(example_tuple[1])
print(example_tuple[-1])
print(example_tuple[2:5])
print(example_tuple[:2])
print(example_tuple[5:])
print(len(example_tuple))
for item in example_tuple:
    print(item)


example_tuple = tuple(("apple", "banana", "cherry")) # note the double round-brackets
print(example_tuple)

#You access the tuple items by referring to the index number:
example_tuple = ("apple", "banana", "cherry")
print(example_tuple[1]) # Output: "banana"

#You can access the tuple items in reverse by using negative index values:

example_tuple = ("apple", "banana", "cherry")
print(example_tuple[-1]) # Output: "cherry"

# You can specify a range of indices by specifying where to start and where to end the range.
example_tuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(example_tuple[2:5]) # Output: ("cherry", "orange", "kiwi")


# By leaving out the start value, the range will start at the first item:

example_tuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(example_tuple[:2]) # Output: ("apple", "banana")

# By leaving out the end value, the range will go on to the end of the tuple:

example_tuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(example_tuple[5:]) # Output: ("melon", "mango")

# You can loop through the tuple items by using a for loop:

example_tuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango",1,2,3,5)
for item in example_tuple:
    print(item)
print('Length of Tuple is: ',len(example_tuple))

# It is also possible to use the tuple() constructor to make a new tuple.
example_tuple = tuple(("apple", "banana", "cherry")) # note the double round-brackets
print(example_tuple) # Output: ("apple", "banana", "cherry")