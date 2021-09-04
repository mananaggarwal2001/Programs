def greater_Than_5(num):
    if(num>5):
        return True
    else:
        return False

listL= [1,2,33,4,5,7,1,2,3,4,5,6,7,8,9,9]
# filter Syntax : list(filter(function , list))
g10 = lambda num : num>8
print(list(filter(greater_Than_5,listL)))
print(list(filter(g10,listL)))