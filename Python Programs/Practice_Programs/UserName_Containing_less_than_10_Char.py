username= input("Enter the username: ")
usernameLength= len(username)
if(usernameLength<10):
    print("Username contains less than 10 Characters")
else:
    print("Username does not contain less than 10 Characters")