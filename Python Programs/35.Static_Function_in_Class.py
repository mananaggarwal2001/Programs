class Employee:
    company="Google"
    def getSalary(self):
        print(self.salary, self.salary1 , "Salary is not there")

    @staticmethod
    def greeting():
        print("Good morning Sir!!")
    @staticmethod
    def datetime():
        print("The time is the 9AM in the morning")
# we can make as many static method as we can.




manan= Employee()
manan.salary= 300
manan.salary1= 400
# manan.getSalary() # = Employee.getsalary(manan) is the same when internally converted  by the compiler and we can use the instance attributes and class both even when the instance attribute is not present.
manan.getSalary()
manan.getSalary()
manan.greeting() # staticmethod decorator tell the compiler to not to the change the manan.greeting() into the Employee.greeting(manan) and it does not required the self parameter.
manan.datetime()
