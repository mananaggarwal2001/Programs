class person:
    country="India"
    def takeBreath(self):
        print("I am breathing")

class Employee (person):
    company="Honda"
    def getSalary(self):
        print(f"Salary is : {self.salary}")

    def takeBreath(self):
        print("I am an employee so i am luckly breathing also")

class Programmer(Employee):
    company= "Fiverr"

    def getSalarty(self):
        print("No salary was given to programmers ")

    def takeBreath(self):
        print("I am an programmer so i am breathing ++")

p= person()
p.takeBreath()
# print(p.company) # person class will throw an error and it will show the error
e= Employee()
e.takeBreath()
print(e.company)
pr=Programmer()
print(pr.company)
pr.takeBreath()
print(pr.country)


