class Animanls:
    def __init__(self):
        print("This is the pets Class")

class pets(Animanls):
    def __init__(self):
        super().__init__()
        print("This is the Animals Class")

class dog(pets):
    def __init__(self):
        super().__init__()
        print("This is the Dog Class ")

    @staticmethod
    def bark():
        print("Bhow Bhow !!!!!!")





