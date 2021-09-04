set1Length= int(input())
elementsSet1= set(map(int, input().split()))
set2Length= int(input())
elementsSet2= set(map(int, input().split()))
uniqueList1= list(elementsSet1.difference(elementsSet2))
uniqueList2= list(elementsSet2.difference(elementsSet1))
combinedList= [item for item in uniqueList1]
for item2 in uniqueList2:
    combinedList.append(item2)

combinedList.sort()
for item in combinedList:
    print(item)
