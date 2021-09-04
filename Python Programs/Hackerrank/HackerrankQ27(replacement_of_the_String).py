from itertools import combinations, combinations_with_replacement
S,K=input().upper().split()
integer= int(K)
Sortedcharacters= sorted(S)
List=list(combinations_with_replacement(Sortedcharacters,integer))
combined_List=[]
for item in List:
    JoinedItem= "".join(i for i in item)
    combined_List.append(JoinedItem)

for item in combined_List:
    print(item)
