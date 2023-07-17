example_set = {"apple", "banana", "cherry"}
print(example_set)

example_set.add("orange") # One Item
example_set.update(["mango", "grape"])
print(len(example_set))
example_set.remove("banana")
example_set.discard("cherry")
for item in example_set:
    print(item)