try:
    a= int(input("Enter the dividend : "))
    b= int(input("Enter the Divisior: "))
    value= a/b
    print(value)
except ZeroDivisionError as e:
    print("Infinite")
