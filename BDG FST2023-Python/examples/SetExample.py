#example_set = {"apple", "banana", "cherry"}
example_set = set(("apple", "banana", "cherry"))
example_set.add("orange") # One Item
example_set.update(["mango", "grape"]) # Multiple Items
print(len(example_set))
example_set.remove("banana")
example_set.discard("cherry")
for item in example_set:
    print(item)
print(example_set)