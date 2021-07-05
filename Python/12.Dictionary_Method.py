
# we can also put integer integer value in the dictionary


mydictionary = {
    "Fast": "In a quick Manner",
    "Manan": "is a good boy ",
    "Harry": "A coder",
    "Marks": [1, 2, 3, 4, 5, 6],
    "anotherDit": {
        "harry": "A player"
    },
    1:2
}
# Dictionary Methods

# print(type(mydictionary.keys()))
# print(mydictionary.keys())
# we can also convert into the list

# print(list(mydictionary.keys()))
# print(mydictionary.values())

# mydictionary.items() will return the tuple (key: value ) for all the contents in the dictionary.
# print(mydictionary.items())
# to update the dictionary
updateDic={
    "Lovish":"Friend",
    "Naman":"Brother"
}

print(mydictionary["Manan"]) # print value associated with the key manan.


# update() method in the dictionary will updates the dictionary by adding the key-value pairs
# and also updates the already remaing key-value pair .
mydictionary.update(updateDic)
print(mydictionary.items())
# get() method in the dictionary

# The difference between .get() and [] syntax in dictionary.
print(mydictionary.get("Fast2")) # this will show the none as the value if the key-value pair is not present in the dictionary
print(mydictionary["Fast2"]) # this will throw an error

# The main difference between print(mydictionary.get("Fast2")) and print(mydictionary["Fast2"])
# is the get() method will not throw an error in the dictionary and will give the value none in the dictionary.
# in the print(mydictionary["Fast2"]) we have to ensure that the key is present in the dictionary and if not present it will throw an error
