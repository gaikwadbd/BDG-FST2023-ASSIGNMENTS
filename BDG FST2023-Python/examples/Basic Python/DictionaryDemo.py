# Disctionary Data type stores the more than one value in one variable name, in terms of key value pairs.
# Dictionary items are in brackets {} in key:value pairs, separated with "," {'k1':'v1', 'k2':'v2'}
# No Sequencing , No Indexing and No Mapping

dicCars = {'Make': 'Maruti', 'Model': 'WagonR', 'Year': '2023'}
print(dicCars)
dicEmpty = {}
model = dicCars['Model']
print(dicCars['Make'])
dicEmpty['one'] = 1
dicEmpty['two'] = 2
print(dicEmpty)

intSum = dicEmpty['two'] + 8
print(intSum)
print(dicEmpty)

dicEmpty['two'] = dicEmpty['two'] + 8
print(dicEmpty)