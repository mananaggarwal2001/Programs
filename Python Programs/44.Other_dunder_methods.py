class Number:
    def __init__(self, num):  # __(name)__ is called the dender method.
        self.num = num

    def __add__(self, num2): # this function is instructing the objects that how to add the two Numbers in the when the Objects in the class is used.
        print("Let's add the Numbers")
        return self.num + num2.num

    def __mul__(self,num2):
        print("Let's multiply the Numbers ")
        return self.num * num2.num
    def __str__(self):
        return ("Decimal is "+ str(type(self.num)))

    def __len__(self):
        return 1



n1 = Number(9.0)
print(n1)
print(len(n1))

