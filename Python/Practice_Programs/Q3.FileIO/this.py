content=None
with open('this.txt') as file:
    content=file.read()

with open('this2.txt','w') as file:
    file.write(content)
