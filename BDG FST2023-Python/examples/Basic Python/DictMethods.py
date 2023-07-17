# Methods in Dictionary

dictCar = {'MAKE': 'MERCEDES', 'MODEL': 'E390', 'YEAR': 2023}
dictCars = {'TATA': {'MODEL': 'HARIER', 'YEAR': 2022}, 'MARUTI': {'MODEL': 'SCROSS', 'YEAR': 2020}}

print(dictCars.keys())
print(dictCar.keys())
print(dictCar.values())
print(dictCars.values())
print(dictCar.items())

dictCarCopy = dictCar.copy()
print(dictCarCopy)

print(dictCar.pop('model'))
print(dictCar)
