with open('sample.txt','r') as file:
    content=file.read()

content=content.replace('donkey','@@@@@@@@@@@@@@')
with open('sample.txt','w') as file:
    file.write(content)
