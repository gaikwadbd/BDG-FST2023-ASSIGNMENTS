# Longest word

# Reading sentence from user

sentence = input("Enter sentence: ")

# Finding longest word
longest = max(sentence.split(), key=len)

# Displaying longest word
print("Longest word is: ", longest)
print("And its length is: ", len(longest))

# Shortest word

# Reading text from user

text = input("Enter some text: ")

# Finding longest word
shortest = min(text.split(), key=len)

# Displaying longest word
print("Shortest word is: ", shortest)
print("And its length is: ", len(shortest))


# Frequency of each character in string

# Get string from user
string = input("Enter some text: ")

# Set frequency as empty dictionary
frequency_dict = {}

for character in string:
    if character in frequency_dict:
        frequency_dict[character] += 1
    else:
        frequency_dict[character] = 1

# Displaying result
print("\n--------------------------")
print("Character\tFrequency")
print("--------------------------")
for character, frequency in frequency_dict.items():
    print("%5c\t\t%5d" %(character, frequency))



# Get string from user
string = input("Enter some text: ")

# Set frequency as empty dictionary
frequency_dict = {}

for character in string:
    if character in frequency_dict:
        frequency_dict[character] += 1
    else:
        frequency_dict[character] = 1

most_occurring = max(frequency_dict, key=frequency_dict.get)

# Displaying result
print("\nMost occuring character is: ", most_occurring)
print("It is repeated %d times" %(frequency_dict[most_occurring]))

# String concatenation after format
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))