try:
    number= int(input("Enter the Number: "))
    c=1/number
    print(c)
except Exception as e:
    print(e)
else:
    print("The code is run successfully")

# this else statement will run only if the try block is sucessfully executed otherwise not.