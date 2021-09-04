# Concentnation of Two Strings
# greeting= "Good Morning, "
# name= "Manan"
# print(type(name))
# we can also concat the String in the python
# (Only Strings we can Concat Not the String With the Other Data Types)
# c= greeting + name
# print(c)

# Slicing of the String
name= "Manan"
# We get the character of the name if we put index in the Square Brackets
print(name[0])
# name[3]= 'an' --> Does not Work
print(name[0:3])
# -> the last  number in the range is excluded in the python
# as it will print the characters of the indices 0,1,2
print(name[0:4])
# characters of the indices 0,1,2,3
# Range within the square brackets [] the last number is always excluding


print(name[:4]) # is same as name[0:4]
print(name[0:]) # is same as name[0:5]

# for the negative indices we have the
c= name[-4:-1] # is same as the name[1:4]
print(c)

# third Character is used for the Skipping the Characters Next to the Charaters in the python
# for Example : name[0::3] then it will skip 2 characters and print the third Character in the String.

name= "MananIsGoodBoy"
c= name[0::3]
# Masoo
print(c)
name= "harryisaGoodBoy"
c=name[0::4]
# hyGB
print(c)