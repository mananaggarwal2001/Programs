class vector:
    def __init__(self,icap,jcap,kcap):
        self.icap=icap
        self.jcap= jcap
        self.kcap=kcap

    def __add__(self,num2):
        return vector((self.icap+num2.icap),(self.jcap+num2.jcap),(self.kcap+num2.kcap))

    def __str__(self):
        return str(self.icap) + "i " + " + " +  str(self.jcap) + "j " + " + " + str(self.kcap) + "k "

    def __mul__(self,num2):
        productType= input("Enter the Type of Product you want dot or cross: ")
        if(productType=="dot"):
            product=1
            product= (self.icap * num2.icap) + (self.jcap * num2.jcap) + (self.kcap * num2.kcap)
            return product
        elif(productType=="cross"):
            return vector((self.jcap*num2.kcap-self.kcap*num2.jcap), (self.icap*num2.kcap - self.kcap*num2.icap), (self.icap*num2.jcap-self.jcap*num2.icap))

    def __sub__(self,num2):
        return vector((self.icap-num2.icap),(self.jcap-num2.jcap),(self.kcap-num2.kcap))

    def __len__(self):
        return 3



V1= vector(1,2,1)
V2= vector(2,1,2)
sum= V1+V2
multiply= V1 * V2
print(multiply)
print(sum)
print(V1)
print(V2)
print(V1-V2)