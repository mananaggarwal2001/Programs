# THIS IS SINGLE INHERITANCE EXAMPLE.
# parent Class
class Employee:
    company="Google"
    def showDetails(self):
        print("This is an Employee")

#child Class
#Syntax of the child class
class programmer(Employee):
    language ="Python"

    def getLanguage(self):
        print(f"The Language is {self.language}")

    def showDetails(self): # we can also overwrite the class in the python and
                            #  and the child class functions will run first and then the base class.
        print("This is programmer Class and the details are given below.")


child= programmer()
parent= Employee()

child.showDetails() # in this the child class function  will run rathar than the parent class function due to we have overwrite the class.
parent.showDetails()
child.getLanguage()