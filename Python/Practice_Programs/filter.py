def divisibleBy5(num):
    if (num % 5==0):
        return True
    else:
        return False

listL1 = [1, 2, 3, 4, 5, 10, 15, 20, 30]
filteredList = list(filter(divisibleBy5, listL1))
print(filteredList)
