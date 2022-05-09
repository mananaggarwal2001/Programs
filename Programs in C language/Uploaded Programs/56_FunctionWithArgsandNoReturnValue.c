#include <stdio.h>
void Rectangle(float a, float b)
{
    float Area = 0;
    Area = a * b;
    printf("The Area of the Rectangle is : %f ", Area);
}
int main()
{
    float a, b;
    printf("Enter the Length of the Rectangle: ");
    scanf("%f", &a);
    printf("Enter the Breadth of the Rectangle: ");
    scanf("%f", &b);
    Rectangle(a, b);
}