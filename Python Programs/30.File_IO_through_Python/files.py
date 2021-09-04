# use open function to read the content of the file
# use the read function to read the text file.
# f=open("sample.txt", 'r')
f= open('sample.txt') # by default the mode is read mode in the file in the python
data= f.read() # reads the first five characters in the python

print(data)
f.close()