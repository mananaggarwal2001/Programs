class Employee:
    company="Camel"
    salary=100
    location="Delhi"

    # def changeSalary(self,sal):
    #     # Method 1 for changing the class attribute.
    #     # self.__class__.salary=sal
    #     self.salary=sal

    @classmethod # CLASS METHOD DECRORATOR
    def changeSalary(cls,sal):   # Method 3:-  this is used for the accessing the class attributes directly and to change them accordingly not the object of the class
                                 # it will change the class attribute directly to the class.
                                 # it is used for accessing the class directly by using the class method.
        cls.salary=sal

e=Employee()
e.changeSalary(455)
print(e.salary)
print(Employee.salary)
# Method 2 for changing the class attribute.
# Employee.salary=455
# print(Employee.salary)