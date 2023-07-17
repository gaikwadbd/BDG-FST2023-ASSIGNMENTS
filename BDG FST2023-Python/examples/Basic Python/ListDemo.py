# List is data type which stores more than one value in a variable.
# List items are in brackets, separated with "," [ 1, 2, 3 ]

listCar = ['Tata', 'Maruti', 'Mahindra', 'Hudayi', 'Suzuki', 'Honda', 'Escorts', 'BMW', 'Mercedez', 'Tesla']
print(listCar)
listEmpty = []
print(listEmpty)
print("#" * 20)
print(listCar[-1])
intNum = [10, 20, 30, 40, 50, 40, 30, 20, 10]
intSum = intNum[0] + intNum[1]
print(intSum)
listCars1 = ['Audi', 'Bugatti', 'Jaguar', 'Lambrini']
print(listCars1)
listCars1[1] = 'Mercedez Benz'
print('The Items in listCar is:', listCar, '\n', 'The Items in listCar1 is"', listCars1)
listCars1.append(listCar)
print(listCars1)
print('The list after merging :',listCars1 + listCar)
