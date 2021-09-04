NumberOfElements= int(input())
StampSet= set()
for i in range(NumberOfElements):
    Stamps=input()
    StampSet.add(Stamps)

LengthOfSet= len(StampSet)
print(LengthOfSet)