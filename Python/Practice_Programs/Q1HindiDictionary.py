hindiDictionary={
    "Tap":"Nal",
    "clothes" : "Kapde",
    "Water":"Paani",
    "Bucket":"Baalti"
}
print("Options are in the Dictionary ", hindiDictionary.keys())

b=input("Enter the value which which you want to look in the dictionary: ")
print("The Meaning of the Word in the Dictionary is : ", hindiDictionary.get(b))