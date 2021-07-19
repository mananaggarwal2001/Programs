from itertools import combinations, combinations_with_replacement
S,K=input().upper().split()
integer= int(K)
Sortedcharacters= sorted(S)
List=[]
CombinedList=[]
S_String= "".join(item for item in Sortedcharacters)
for i in range(1,integer+1):
    List.append( list(combinations(S_String,i)))

for item in List:
    for Subitem in item:
        S_Sitem="".join(S_item for S_item in Subitem)
        CombinedList.append(S_Sitem)

for item in CombinedList:
    print(item)