# pop
# remove 9
# discard 9
# discard 8
# remove 7
# pop
# discard 6
# remove 5
# pop
# discard 5

numberOfElements= int(input())
setList= set(map(int,input().split()))
numberOfCommands= int(input())
for i in range(numberOfCommands):
    List = list(input().split())
    if(List[0]=='remove'):
        setList.remove(int(List[1]))
    elif List[0]=='discard':
        setList.discard(int(List[1]))
    elif List[0] == 'pop':
        setList.pop()

sumOfSet= sum(setList)
print(sumOfSet)
