# 2
# Harsh 25 26.5 28
# Anurag 26 28 30
# Harsh


n= int(input())
dictionary={}
records=[]
keys=[]
values=[]
List=[]
for i in range(n):
    SplittedKey=input().split()
    records.append(SplittedKey)
Query_Data= input()
lengthOfRecords= len(records)
individualRecordLength= 4
for i in records:
    keys.append(i[0])
    for j in range(1,4):
       List.append(float(i[j]))

    values.append(List)
    List=[]

for i in range(lengthOfRecords):
    dictionary[keys[i]]=values[i]

Average=(sum(dictionary.get(Query_Data)))/3
format_Average= "{:.2f}".format(Average)
print(format_Average)
