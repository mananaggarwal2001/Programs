def count_substring(string, sub_string):
    Lower_String = string.lower()
    Lower_SubString = sub_string.lower()
    lengthOfString = len(string)
    count = 0
    for i in range(lengthOfString):
        if Lower_String[i:].startswith(Lower_SubString):
            count+=1

    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)