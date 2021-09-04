n= int(input())
StringList = input().split()
integerList=[]
LengthOfString= len(StringList)
if(LengthOfString==n):
    for i in StringList:
        integerList.append(int(i))

T=tuple(integerList)
print(hash(T))