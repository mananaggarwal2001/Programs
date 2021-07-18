try:
    with open("1.txt", 'r') as f:
        print("File is in the running condition")

    with open("2.txt", 'r') as f:
        print("File is in the running condition")

    with open("3.txt", 'r') as f:
        print("File is in the running condition")
except Exception as e:
    print("File Not found please ensure that the file is available in the directory")
    print("Opening the file in the Write mode")
    with open("1.txt", 'w') as f:
        print("File 1 is opened in the writing mode")
        f.write("File 1 was opened")
    with open("2.txt", 'w') as f:
        print("File 2 is opened in the writing mode")
        f.write("File 2 was opened")

    with open("3.txt", 'w') as f:
        print("File 3 is opened in the writing mode")
        f.write("File 3 was opened")

