example_dict =	{
    "brand": "Ford",
    "model": "Mustang",
    "year": 1964
}
print(example_dict)
x = example_dict["model"]
example_dict["year"] = 2018
for x in example_dict:
    print(x)
for x in example_dict.values():
    print(x)
for x, y in example_dict.items():
    print(x, y)
example_dict["color"] = "red"
print(example_dict)
print(len(example_dict))
example_dict.pop("model")
print(example_dict)
example_dict.popitem()
print(example_dict)