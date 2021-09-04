from functools import reduce
listL1= [1,2,3,4,5]
sumOfNumber = lambda a,b: a+b
# reduce syntax: reduce(function ,list)
print(reduce(sumOfNumber,listL1))