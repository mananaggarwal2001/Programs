class Employee:
    Salary= 4000
    Increament=500

    @property
    def totalSalary(self):
        return self.Salary

    @totalSalary.setter    # anonymous Function
    def totalSalary(self,val):
        self.Increament= val-self.Salary

E= Employee()
E.totalSalary= 5800 # as an property we are using
print(E.Salary)
print(E.Increament)
