n,m=map(int , input().split())
ListOfArray = list(map(int , input().split()))
setA= set(map(int, input().split()))
setB= set(map(int,input().split()))
happinessMeter=sum([(i in setA)-(i in setB) for i in ListOfArray])
print(happinessMeter)


