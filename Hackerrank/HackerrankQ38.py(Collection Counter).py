from collections import Counter
# collections.Counter()
# A counter is a container that stores elements as dictionary keys, and their counts are stored as dictionary values.
# only the values that are positive will be returned.

numberOfShoes = int(input())
listOfSizes = Counter(map(int, input().split()))
numberOfCustomeer = int(input())
income=0
for i in range(numberOfCustomeer):
    key, price = map(int, input().split())
    if listOfSizes[key]:
        income+=price
        listOfSizes[key]-=1

print(income)