a= 45 # global variable
def funct1():
    global a # if we have written the global at the starting of the function then it will start working on the global variable in the python.
    print(f"Print statement 1: {a}")
    # when the global variable is written then it will change the value of the global variable and work on the global value.
    a=8 # local variable is made when the global keyword is not used.
    print(f"Print statement 2: {a}")

funct1()
print(f"Print statement 3:{a}")