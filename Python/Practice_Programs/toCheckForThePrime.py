Number= int(input("Enter the Number: "))
count=0
for i in range(2,Number):
    if(Number%i is 0):
        count=count+1

if(count>0):
    print("it is Not a Prime Number")
else:
    print("It is a Prime Number")
