import math
class calculator:
    def __init__(self,number):
        self.number=number

    @staticmethod
    def greeting():
        print('HELLO USER ')
    def square(self):
        # print(f"Square of the Number:- {math.pow(self.number, 2)}")
        print(f"Square of the number:- {self.number**2}")
        # ** operator is used for changing the number to some power in the python .


    def cube(self):
        print(f"Cube of the Number:- {math.pow(self.number, 3)}")

    def squareRoot(self):
        print(f"Square root of Number is:- {math.sqrt(self.number)} ")


integer= float(input("Enter Your Nunber: "))
Number= calculator(integer)
Number.greeting()
Number.square()
Number.squareRoot()
Number.cube()