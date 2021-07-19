from itertools import permutations
S,K=input().split()
integer= int(K)
List= list(permutations(S,integer))
CombinedList=[]
for item in List:
    JoinedValues= "".join(i for i in item)
    CombinedList.append(JoinedValues)

CombinedList.sort()
for C_item in CombinedList:
    print(C_item)