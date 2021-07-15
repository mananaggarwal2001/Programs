class person:
    country="India"

    def __init__(self):
        print("Initializng constructor of person")

    def takeBreath(self):
        print("I am breathing")

class Employee (person):
    company="Honda"
    def __init__(self):
        super().__init__()
        print("Initializng constructor of employee")

    def getSalary(self):
        print(f"Salary is : {self.salary}")

    def takeBreath(self):
        print("I am an employee so i am luckly breathing also")

class Programmer(Employee):
    company= "Fiverr"
    def __init__(self):
        super().__init__()
        print("Initializng constructor of programmer")

    def getSalarty(self):
        print("No salary was given to programmers ")

    def takeBreath(self):
        super().takeBreath()
        print("I am an programmer so i am breathing ++")

# p= person()

# e= Employee()

pr=Programmer()
# pr.takeBreath()

