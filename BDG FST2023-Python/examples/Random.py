import random
while True:
    number = int(input('Enter number form 1 to 10: '))
    generated = random.randint(1,10)
    if generated == number:
        print('You Won!')
        break
    else:
        print('Try Again')