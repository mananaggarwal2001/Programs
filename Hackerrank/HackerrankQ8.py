n = int(input())
position=None
arr = map(int, input().split())
List=list(arr)
lengthOfList= len(List)
if(lengthOfList==n):
    List.sort()
    Integer=List[lengthOfList-1]
    for i in range(lengthOfList):
        if(List[i]!=Integer):
            position=i
    RunnerUp=List[position]
print(RunnerUp)