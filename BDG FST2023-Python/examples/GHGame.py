# Ghost Game in Python

from random import randint

print("******************************")
print("******************************")
print("********* GHOST GAME *********")
print("******************************")
print("******************************")
print()
print("******************************")
print("***** THREE DOORS AHEAD  *****")
print("******************************")
print()
print("******************************")
print("THERE IS A GHOST BEHIND 1 DOOR")
print("******************************")
print()
print("******************************")
print("YOU KEEP ON CHOOSING 1 DOOR \n  UNTIL IT IS A GHOST DOOR. \n\nEACH DOOR WITHOUT GHOST \n   GETS YOU FIVE POINTS")
print("******************************")

score = 0

while True:
    ghost_door = randint(1,3)
    door_choosen = int(input("\n\nWHICH DOOR 1 OR 2 OR 3? "))

    if ghost_door == door_choosen:
        print("\nGHOST! GHOST!! GHOST!!!")
        break
    else:
        print("YOU EARNED FIVE POINTS :)")
        score += 5

print("\nYOUR SCORE =", score)
print("\n\n********** GAME OVER **********")