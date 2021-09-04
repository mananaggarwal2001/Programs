with open('log.txt') as file:
    content= file.read()

if "python" in content.lower():
    print("Yes python is present")
else:
    print("No python is not present")