a=[3,6,8,9,10,11,12,23,34,45,1,10,]
# Longcut for writing the code
# b=[]
# for item in a:
#     if item%2==0:
#         b.append(item)

# print(b)

# shortcut for writing the same code in the above.
b= [item for item in a  if item%2==0]
print(b)

# for the set function
t=[1,2,3,4,5,6,7,8,9,23,3,4,5,6,7,8,9]
f={item for item in t}
print(f)