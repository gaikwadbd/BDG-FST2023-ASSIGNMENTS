#Swapping numbers
firstNum = int(input('Enter first number: '))
secondNum = int(input('Enter second number: '))
firstNum, secondNum = secondNum, firstNum
print('After Swapping First number = %d and second number = %d' %(firstNum, secondNum))