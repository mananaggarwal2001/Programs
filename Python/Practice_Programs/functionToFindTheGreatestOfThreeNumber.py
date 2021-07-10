def greatest(num1,num2,num3):
    if(num1>num2):
        great=num1
    else:
        great=num2

    if(num2>num3):
        great1=num2
    else:
        great1=num3

    if(great>great1):
        return great
    else:
        return great1



num1= int(input("Enter the Number 1: "))
num2= int(input("Enter the Number 2: "))
num3= int(input("Enter the Number 3: "))

greatestNumber= greatest(num1,num2,num3)
print("The greatest of the three Number is : " , greatestNumber)