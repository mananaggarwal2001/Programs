# use the first
f= open('sample.txt')
data= f.readline()
# readline function only reads the first line in the file.
# if we write the readline function again then it will read the next line in the file in the python
print(data)

# read  the second line .
data2= f.readline()
print(data2)

# read the third line in the python.
data3= f.readline()
print(data3)

f.close()