# Built in Methods to manipulate list
listCars = ['Audi', 'Mercedez Benz', 'Jaguar', 'Lambrini',
            ['Tata', 'Maruti', 'Mahindra', 'Hudayi', 'Suzuki', 'Honda', 'Escorts', 'BMW', 'Mercedez', 'Tesla'], 'Tata',
            'Maruti', 'Mahindra', 'Hudayi', 'Suzuki', 'Honda', 'Escorts', 'BMW', 'Mercedez', 'Tesla']
print(listCars)
length = len(listCars)
print(length)
listCars.insert(1,'Minicooper')
listCars.append('Jeep')
print(listCars)
x=listCars.index('Suzuki')
print(x)
y=listCars.pop()
print(y)
listCars.remove('Hudayi')
print(listCars[0:2])
print(listCars[1:])
print("#"*20)
print(listCars)
listCars=listCars.sort()
print(listCars)