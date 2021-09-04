content= True
i=0
with open('log.txt') as file:
    while content:
        i+=1
        content= file.readline()

        if "python" in content.lower():
            print(f"Yes python is present on the Line: {i}")