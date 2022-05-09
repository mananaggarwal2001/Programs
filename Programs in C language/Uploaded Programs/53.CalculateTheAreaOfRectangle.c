#include <stdio.h>
float rectangle(float a, float b)
{
    float Area = a * b;
    return Area;
}

int main()
{
    float a = 0, b = 0, Area;
    printf("Enter the Length of the rectangle: ");
    scanf("%f", &a);

    printf("Enter the Breadth of the rectangle: ");
    scanf("%f", &b);
    Area = rectangle(a, b);
    printf("The Area of the Rectangle is : %f ", Area);
}