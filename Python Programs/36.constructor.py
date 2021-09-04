class Employee:
    company="Google"
    # syntax of the constructor
    def __init__(self,name,salary,subunit):
        self.name= name
        self.salary= salary
        self.subunit=subunit
        print(f"Employee is created!! and the details is :\n name: {name} \n Salary: {salary}\n subunit: {subunit} ")


    def getSalary(self):
        print(self.salary, self.salary1 , "Salary is not there")

    def getDetails(self):
        print(f"The name of the employee is : {self.name} \nThe salary of the employee is: {self.salary} \nThe Subunit of the employee is: {self.subunit}   ")

    @staticmethod
    def greeting():
        print("Good morning Sir!!")

    @staticmethod
    def datetime():
        print("The time is the 9AM in the morning")

manan= Employee("Manan",100,"Printers") # as soon as the object is created the constructor method runs .
# manan= Employee() --> this throws an error. (missing three required arguments)
manan.getDetails()