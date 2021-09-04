class Employee:
    company = "google"
    salary = 100

Manan = Employee()
Aman = Employee()
# create the instance attribute salary  for both the instances of the class.
# Manan.salary= 300
# Aman.salary= 400
# 1st preference goes to the object attribute.
# 2nd preference goes to the class attribute if object attribute is not available.
print(Manan.salary)
print(Aman.salary)

# below line throws an error as address attribute is not available in the
# print(Manan.address)