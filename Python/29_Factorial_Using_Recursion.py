
# recursion Function for the Factorial
# def factorial(n):
#     product = 1
#     for i in range(n):
#         product=product*(i+1)
#     return product

# print(factorial(5))


def factorial_recursion(n):
    print(n)
    if(n==1 or n==0):
        return 1
    else:
        return n * factorial_recursion(n-1)


factorial= factorial_recursion(5)
print(factorial)

