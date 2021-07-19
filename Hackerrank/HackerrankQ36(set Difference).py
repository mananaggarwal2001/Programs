# 9
# 1 2 3 4 5 6 7 8 9
# 9
# 10 1 2 3 11 21 55 6 8

NoofStudentsE= int(input())
ListofEnglishNewspaper= set(map(int,input().split()))
NoofStudentsF= int(input())
ListofFrenchNewspaper= set(map(int,input().split()))
Set= ListofEnglishNewspaper.difference(ListofFrenchNewspaper)
LengthOfSet= len(Set)
print(Set)
print(LengthOfSet)