letter = '''Dear <|NAME|>
You are Selected,
date: <|DATE|>
'''
name = input("Enter Your name : ");
date = input("Enter your date : ");
letter= letter.replace("<|NAME|>", name)
letter= letter.replace("<|DATE|>", date)
print(letter)