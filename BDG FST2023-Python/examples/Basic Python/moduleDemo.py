import math
from math import sqrt


class ModulesDemo():

    def builtinModules(self):
        print(math.sqrt(100))
        print(sqrt(100))


m = ModulesDemo()
m.builtinModules()


def carDetails(maker, model):
    print("Make of the car: " + maker)
    print("Model of the car: " + model)


carDetails('Mercedez', 'E380')

