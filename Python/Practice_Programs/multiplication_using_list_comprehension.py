integer= int(input("Enter the Number for which you want the table for : "))
tableList=[integer*item for item in range(1,11) ]
print(tableList)

try:
    with open(f"tableFile.txt{integer}","r") as f:
        fileRead= f.read()
        print(fileRead)
except Exception as e:
    with open(f"tableFile.txt{integer}","w") as f:
        for item in tableList:
            f.write(str(item) + "\n")
        print(f"Table of {integer} has been written sucessfully in the file ")
finally:
    print("The Procedure is done")