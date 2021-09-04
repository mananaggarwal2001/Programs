while(True):
    Number= input("Enter the Number in : ")
    try:
        print("Trying.....")
        if Number=='q' or Number=='Q':   # this try block only affect the interation but does not stop the Running of the code
            break
        Number= int(Number)              # if try block will fail the except block will execute
                                         # try block will try to run the code the code as far as possible but if failed then it will exeute the except block.
        if Number>6:
            print("The Number is greater than 6 ")
    except Exception as e:
        print(f"You have written the wrong input Might be other than Number Please write the number{e}")

print("Thanks for playing this game")