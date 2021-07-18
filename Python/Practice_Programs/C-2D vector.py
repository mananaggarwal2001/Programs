class Vector2D:
    def __init__(self,num1,num2):
        self.num1= num1
        self.num2= num2

    def print(self):
        print(self.num1)
        print(self.num2)

class Vector3D(Vector2D):
    def __init__(self,num1,num2,num3):
        super().__init__(num1,num2)
        self.num3= num3

    def print(self):
        super().print()
        print(self.num3)


V2D= Vector2D(3,4)
V3D= Vector3D(3,4,5)
V3D.print()

