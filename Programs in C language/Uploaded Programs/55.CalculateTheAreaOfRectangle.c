#include <stdio.h>
void Rectangle()
{
    float a = 0, b = 0, Area = 0;
    printf("Enter the Length of the Rectangle: ");
    scanf("%f", &a);
    printf("Enter the Breadth of the Rectangle: ");
    scanf("%f", &b);
    Area= a*b;
    printf("The Area of the Rectangle is : %f ",Area);

}
int main()
{
    Rectangle();
}