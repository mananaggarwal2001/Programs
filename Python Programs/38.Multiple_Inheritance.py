# MULTIPLE INHERTANCE
class employee:
    company="Visa"
    code= 120

class Freelancer:
    company="Fiverr"
    level=3
    def upgrade_Level(self):
        self.level=self.level+1

# prority is given according to the (name of the class) in the function.
# eg if we write the class programmer(employee,Freelancer) then the attributes of the employee class is given the first priority and then the Freelancer Class.
class programmer(employee,Freelancer): # this is multiple inherited class.
    name="Manan"


p=programmer()
print(p.company) # to avoid ambiguty the first class written in the programmer class their attributes will be given the first priority and the 2 argument will given the 2nd priority

