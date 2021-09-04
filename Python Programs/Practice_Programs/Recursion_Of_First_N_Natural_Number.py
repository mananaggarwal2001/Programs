def Sum_Recursive(n):
    if(n==0):
        return 0
    else:
        return n + Sum_Recursive(n-1)


value= int(input("Enter the Range For Which you want the Sum: "))
Store= Sum_Recursive(value)
print("The Sum is: ", Store)