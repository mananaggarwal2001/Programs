n = 3
for i in range(3):
    if(i==0):
        print("*"*(i+3))
    if(i==1):
        print("*",end="")
        print(" "*i,end="")
        print("*")
    if(i==2):
        print("*"* (i+1))

