
# def is a key word used for making function and the sum is the built in function
def Percent(marks):

    p= ((sum(marks)/400)*100) # return meaning laut chalo iss value ke saath .
    return p

marks=[45,34,100,100]
percentage1= Percent(marks)

marks2=[90,95,100,100]
percentage2=Percent(marks2)

print(percentage1,percentage2)
