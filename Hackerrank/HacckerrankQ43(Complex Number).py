import cmath
complexNumber= complex(input())
polarCoordinate= cmath.polar(complexNumber)
ListCoordinate= list(polarCoordinate)
print(format(ListCoordinate[0],'.3f'))
print(format(ListCoordinate[1],'.3f'))