try:
    a= int(input("Enter the Number: "))
    c=1/a
    print(c)
except ValueError as e:
    print("Please enter the valid value")
except ZeroDivisionError as e:
    print("Make sure you are not dividing the Number by zero")


print("Thanks for using this code!")