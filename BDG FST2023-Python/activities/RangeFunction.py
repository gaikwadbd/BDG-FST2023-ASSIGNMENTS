for x in range(6):
    print(x)
for x in range(2,6):
    print(x)
    print ('***')
for x in range (2,6,2):
    print(x)
else:
    print('finished finally')
# Nested for loop (loop inside loop)
adjectives = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]
for adjective in adjectives:
    for fruit in fruits:
        print(adjective, fruit)