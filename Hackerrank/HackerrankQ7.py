# List=["apple","Mango","Banana","Orange"]
# newList= [x for x in List if x!="apple"]
# OriginalList= [newList]
# print(OriginalList)



x= int(input())
y= int(input())
z= int(input())
n= int(input())
matrix=[[i,j,k]  for i in range(x+1) for j in range(y+1) for k in range(z+1) if i+j+k!=n]
print(matrix)