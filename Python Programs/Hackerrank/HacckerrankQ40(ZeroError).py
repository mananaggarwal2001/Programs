No_of_Test_Cases= int(input())
for i in range(No_of_Test_Cases):
    try:
        A,B=map(int,input().split())
        divide= A/B
        print(int(divide))

    except ZeroDivisionError as e:
        print("Error Code: integer division or modulo by zero")
    except ValueError as e:
        print("Error Code:",e)