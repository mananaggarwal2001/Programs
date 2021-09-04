import random
import os


def gameWin(comp, you):
    # check for all possiblities in the game when computer chose s
    if(comp == 's'):
        if(you == "w"):
            return False
        elif you == "g":
            return True
        elif you == "s":
            return None

    # check for all possiblities in the game when computer chose w
    elif comp == 'w':
        if you == 's':
            return True
        elif you == 'g':
            return False
        elif you == 'w':
            return None

    # check for all possiblities in the game when computer chose g
    elif comp == 'g':
        if you == 's':
            return False
        elif you == 'g':
            return None
        elif you == 'w':
            return True


points = int(input(
    "Enter the Total Numbers of the points For which you want to play the game: "))
turns = 0
ComputerScore = 0
HighScore = 0
YourScore = 0
ExistingScore = 0
IntialScore=0
ListNumbers=[]
comp = None
while(turns < points):
    integer = random.randint(1, 3)
    print("Only write the s,w,g in the console")
    print("Computer's Turn: Enter the value from the Snake(s) , water(w), gun(g): ")
    value = input(
        "Your Turn: Enter the value from the Snake(s) , water(w), gun(g): ")
    if integer == 1:
        comp = 's'
    elif integer == 2:
        comp = 'w'
    elif integer == 3:
        comp = 'g'

    print("Choice made by you: " + value)
    print("Choice made by computer: " + comp)
    result = gameWin(comp, value)
    if result == True:
        YourScore += 1
        print("You Win")
    elif result == False:
        ComputerScore += 1
        print("Computer Win")
    elif result == None:
        YourScore += 1
        ComputerScore += 1
    print()
    print("your Score is: ", YourScore)
    print("Computer Score is: ", ComputerScore)
    turns = turns+1

if(YourScore > ComputerScore):
    HighScore = YourScore
else:
    HighScore = ComputerScore

if(os.path.isfile('highScore.txt')):
    with open('highScore.txt', 'r') as data:
        IntialScore = int(data.read())

    if IntialScore > HighScore:
        with open('highScore.txt','r') as data:
            ExistingScore = int(data.read())
    elif IntialScore<HighScore:
        with open('highScore.txt','w') as dataWrite:
            dataWrite.write(str(HighScore))

        with open('highScore.txt','r') as data:
            ExistingScore = int(data.read())
else:
    with open('highScore.txt','w') as file:
        file.write(str(HighScore))

print("High Score is: " , ExistingScore)
