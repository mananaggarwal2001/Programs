from functools import reduce
List1=[1,2,3,4,5,6,7,10]
maximum  = lambda a,b: max(a,b)
print(reduce(maximum ,List1))