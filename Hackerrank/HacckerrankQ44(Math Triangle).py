import math
LengthofAB= int(input())
LengthofBC= int(input())
if LengthofAB>0 and LengthofBC>0:
    LengthOfAC=math.hypot(LengthofAB,LengthofBC)
    AngleOfBC= round(math.degrees(math.acos(LengthofBC/LengthOfAC)))
    print(str(AngleOfBC)+"\N{DEGREE SIGN}")