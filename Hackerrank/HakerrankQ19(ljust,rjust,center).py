thickness = int(input())
c = 'H'
# for top Belt
for i in range(thickness):
    print((((2*i)+1)*c).center(thickness*2), end="\n")

# for the Left Belt
for i in range(thickness+1):
    print(((thickness)*c).center((thickness)*2), end="")
    print(((thickness)*c).center((thickness)*6))

# for middle Belt
for i in range(int(thickness/2)+1):
    print((thickness*5*c).center(thickness*6))

# for right belt :
for i in range(thickness+1):
    print(((thickness)*c).center((thickness)*2), end="")
    print(((thickness)*c).center((thickness)*6))

for i in range(thickness):
    print(((2*(thickness-i)-1)*c).center(thickness*10))
