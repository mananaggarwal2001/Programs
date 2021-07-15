class Number:
    def __init__(self, num):  # __(name)__ is called the dender method.
        self.num = num

    def __add__(self, num2): # this function is instructing the objects that how to add the two Numbers in the when the Objects in the class is used.
        print("Let's add the Numbers")
        return self.num + num2.num

    def __mul__(self,num2):
        print("Let's multiply the Numbers ")
        return self.num * num2.num


n1= Number(2)
n2= Number(4)
sum=n1+n2
print(sum)

mul= n1*n2
print(mul)
# these methods are used for overloading in the operands to instruct how to do the things
# the __add__ is instructing both of the objects that how to add the two Numbers as the  parameter was the num which was going to the constructor of
# the number Object n1 and the n2 object which was going to  the __add__ method which was defined in the Number class.
