#include <stdio.h>
float Rectangle()
{
    float a = 0, b = 0, Area = 0;
    printf("Enter the Length of the Rectangle: ");
    scanf("%f", &a);
    printf("Enter the Breadth of the Rectangle: ");
    scanf("%f", &b);
    Area = a * b;
    return Area;
}
int main()
{
    float ReturnRect = Rectangle();
    printf("The Area Of the Rectangle is: %f ",ReturnRect);
}