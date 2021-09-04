spam = input("Enter the Spam Message: ")
if(spam == "make a lot of money"):
    print(spam, True)
elif("buy now " in spam):
    print(spam, True)
elif( "subcribe this" in spam):
    print(spam, True)
elif("click this" in spam):
    print(spam, True)
else:
    print("Spam is not available")