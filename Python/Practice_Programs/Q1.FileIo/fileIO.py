# newFile = open('Twinke.txt',mode='w')
# newFile.write('Twinkle Twinkle Twwinkle')
with open("Twinke.txt" , 'r') as file:
    for line in file:
        print(line)
        for word in line.split():
            if(word =="Twinkle"):
                print("Twinkle word is in the file")
                break
            
