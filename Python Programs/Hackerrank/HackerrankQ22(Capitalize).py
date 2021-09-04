import os
import string

def solve(s):
    formatted = string.capwords(s,sep=" ")
    return formatted
if __name__ == '__main__':

    s = input()
    result= solve(s)
    print(result)











