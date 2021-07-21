# format function introduction
name = input("Enter the Name of the student: ")
marks= int(input("Enter the Marks of the Student: "))
phoneNumber= input("Enter the phone Number of student: ")

string= "The name of the student is: {}, his marks are {} , and phone number is {} ".format(name,marks,phoneNumber)
print(string)
# print(type(string))