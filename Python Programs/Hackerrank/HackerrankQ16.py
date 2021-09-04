def mutate_string(string, position, character):
    L=list(string)
    L[int(position)]= character
    New_String= "".join((item)for item in L)
    return New_String

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)