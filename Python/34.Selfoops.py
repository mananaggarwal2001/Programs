class Employee:
    company="Google"
    def getSalary(self):
        print(self.salary, self.salary1 , "Salary is not there")

manan= Employee()
manan.salary= 300
manan.salary1= 400
manan.getSalary()
manan.getSalary() # = Employee.getsalary(manan) is the same when internally converted  by the compiler and we can use the instance attributes and class both even when the instance attribute is not present.

# was internally converted into the Employee.getSalary(manan)
# if the self parameter was not given then it throws an error
# takes 0 positional argument but 1 were given because the manan.getSalary() was internally  changed  into the Employee.getSalary(manan)
# as internally 1 argument was passed when the function was converted internally by the compiler, that is manan in this case.
# self parameter in the function in the class is the we can use the instance attributes and the class attributes.