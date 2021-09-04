def greeting(name):
    print(f"Good Morning, {name}")

print(__name__)

if __name__=="__main__":             # main refers to the this present module.
    name= input("Enter the name : ")
    greeting(name)


