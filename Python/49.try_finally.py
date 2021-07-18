try:
    number= int(input("Enter the Number: "))
    c=1/number
    print(c)
except Exception as e:
    print(e)
    exit()
finally:
    print("Khatam tata bye bye")

print("thanks for using the program")

# finally block will run irrespective whether the try block is sucessfully run or not. this is no mean to the finally block.
# finally block will execute regardless except quitting the program.