class Employee:
    company = "Bharat gas"
    salary= 5600
    salaryBonus=500

    @property # by using property decorator we can change the function into the property
    def totalSalary(self):
        return self.salary + self.salaryBonus

    @totalSalary.setter
    def totalSalary(self,val):
        self.salaryBonus=val-self.salary

e= Employee()
print(e.totalSalary) # we can't use the () paranthesis as it is a property not the function.
e.totalSalary= 5800
print(e.salary)
print(e.salaryBonus)