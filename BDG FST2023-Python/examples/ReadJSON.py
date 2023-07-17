import json

# read file
with open('../resources/currency.json', 'r') as myfile:
    data=myfile.read()

# parse file
obj = json.loads(data)

# show values
print("USD: " + str(obj['USD']))
print("EUR: " + str(obj['EUR']))
print("GBP: " + str(obj['GBP']))