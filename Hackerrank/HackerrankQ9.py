# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39


N = int(input())
records = []
UnsortedRecords = []
SmallestRecord = None
SecondSmallestRecord = None
SameRecord = []
SameRecordLength = None
if(N >= 2 and N <= 5):
    for i in range(N):
        Name = input()
        Value = float(input())
        UnsortedRecords.append([Name, Value])
        records.append([Name, Value])
records.sort(key=lambda x: x[1], reverse=True)
LengthOfRecord = len(records)
SmallestRecord = records[LengthOfRecord-1]
for i in range(LengthOfRecord):
    if(records[i][1] != SmallestRecord[1]):
        SecondSmallestRecord = records[i]
for i in range(LengthOfRecord):
    if(records[i][1] == SecondSmallestRecord[1]):
        SameRecord.append(records[i])

SameRecordLength = len(SameRecord)
SameRecord.sort(key=lambda x: x[0])
for i in SameRecord:
    print(i[0])