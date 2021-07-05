
# Syntax of a dictionary

from typing import List


mydictionary = {
    "Fast": "In a quick Manner",
    "Manan": "is a good boy ",
    "Harry": "A coder",
    "Marks": [1, 2, 3, 4, 5, 6],
    "anotherDit": {
        "harry": "A player"
    }
}
# print(mydictionary["Manan"])
# print(mydictionary["Harry"])
# print(mydictionary["Marks"])
# print(mydictionary["anotherDit"])
print(mydictionary["anotherDit"]["harry"])