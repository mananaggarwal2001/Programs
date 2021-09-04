# to activate the virtual environment
# for linux users:- source myprject/bin/activate
# for window users:-  .\myprojectenv\Scripts\activate.ps1
# def func(x):
#     return x+566

func= lambda a : a+566
sumOfNumber = lambda a,b,c: a+b+c
square = lambda x : x*x

print(sumOfNumber(3,4,5))
x= 5
print(func(x))
print(square(10))