import textwrap

def wrap(string, max_width):
   L=textwrap.wrap(string,max_width)
   String="\n".join(str(item) for item in L)
   return String

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)