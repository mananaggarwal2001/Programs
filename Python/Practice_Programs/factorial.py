Number= int(input("Enter the Number For the Factorial: "))
OriginalNumber= Number
for i in range(1,OriginalNumber):
    Number*=i

print("The Factorial of the Number " + str(OriginalNumber) +" is: " ,Number)