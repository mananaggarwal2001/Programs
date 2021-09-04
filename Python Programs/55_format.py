name= "manan"
channel = "Manan"
type= "coding"
s= f"This is {name}"

# format function
# string= "This is {} and channel name is {}".format(name,channel)
# for postitional placement in the string we have if we do not want place them in order:
string= "This is {0} and {2} and {1}".format(name,channel, type)
print(string)
# print(s)