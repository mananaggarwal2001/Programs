import string
alpha= string.ascii_lowercase
size= int(input())
List=[]
String=None
for i in range(size):
    String= "-".join(alpha[i:size])
    List.append((String[::-1]+String[1:]).center(size*4-3,"-"))

ListString= "\n".join(List[:0:-1] + List)
print(ListString)