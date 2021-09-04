def Cel_Faraheit(Celsius):
    Faranheit= (Celsius * 1.8) + 32
    return Faranheit


celsius = float(input("Enter the Temp in the degree celsius: "))

CelStore= Cel_Faraheit(celsius)
print("The Temp in the Degree Faranheit is: " , CelStore)