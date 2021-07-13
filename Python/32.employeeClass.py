class Employee:
    company = "google"
    salary = 100


Manan = Employee()
Aman = Employee()
print(Manan.company)
print(Aman.company)
Employee.company = "Youtube"
print(Manan.company)
print(Aman.company)
# we can also give the charcterstics in the attribute as they are unique for each of the employee.
Manan.salary = 400
Aman.salary = 500
print(Manan.salary)
print(Aman.salary)
