contentOfFirstFile=None
contentOfSecondFile=None

with open('file1.txt') as file:
    contentOfFirstFile= file.read()

with open('file2.txt') as file:
    contentOfSecondFile= file.read()

if(contentOfFirstFile==contentOfSecondFile):
    print("file are identical ")
else:
    print('files are not identical')
