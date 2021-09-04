# NoOfElements= int(input())
# List= input().split()
# IntegerList= [int(item) for item in List]

# print(IntegerList)
# lengthOfList= len(IntegerList)
# SetIntroduction= set()
# if NoOfElements==lengthOfList:
#     for item in IntegerList:
#         SetIntroduction.add(item)

# LengthOfSet= len(SetIntroduction)
# Value= sum(SetIntroduction)/LengthOfSet
# DecimalValue= format(Value,'.3f')
# print(DecimalValue)


def average(array):
    lengthOfList= len(array)
    SetIntroduction= set()

    for item in array:
        SetIntroduction.add(item)

    LengthOfSet= len(SetIntroduction)
    Value= sum(SetIntroduction)/LengthOfSet
    DecimalValue= format(Value,'.3f')
    return DecimalValue


if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)