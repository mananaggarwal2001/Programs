# sets is a collection of the non-repitive elements
a = {1, 2, 3, 4, 1}
print(a)
print(type(a))

# Important: This syntax will create the empty dictionary not an empty set.
b = {}
print(type(b))

# The syntax is given below for creating an empty set
b = set()
print(type(b))

# To add the value in the set we use add() method in the set
b.add(12)
b.add(10)
print(b)

# we can't add list in the set but we can add the tuple in the set because we can change the content of the list and
# dictionary but we can't change the value of the tuples in the dictionary
# b.add([1, 2, 3, 4, 5])

## Modifying the element in the set
b.add((1, 2, 3, 4, 5, 6, 7))
print(b)
# Adding a value repitidely does not change a set
b.add(2)
b.add(2)
b.add(2)
print(b)

## Length of the set
print(len(b))  # prints the numbers of elements containing in a set .

## Removal of the element in the set
# b.remove(10)  # removes the 10 from the set
# b.remove(15)  # throws an error while removing the 15 element in the set (which is not present in the set)


## Pop function in the set
# Removes the random element in the set
print(b.pop())
print(b)
