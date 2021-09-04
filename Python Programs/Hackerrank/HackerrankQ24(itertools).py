from itertools import product
A= map(int, input().split())
B= map(int, input().split())
List= list(product(A,B))
for item in List:
    print(item,end=" ")