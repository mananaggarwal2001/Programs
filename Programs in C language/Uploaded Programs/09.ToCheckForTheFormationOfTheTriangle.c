#include <stdlib.h>
#include <stdio.h>
int main()
{
    int angle1 = 0, angle2 = 0, angle3 = 0, sum = 0;
    printf("Enter three angles respectively: ");
    scanf("%d%d%d", &angle1, &angle2, &angle3);
    if (angle1 != 0 && angle2 != 0 && angle3 != 0)
    {
        sum = angle1 + angle2 + angle3;
    }
    if (sum == 180)
    {
        printf("Triangle is able to formed");
    }
    else
    {
        printf("Triangle is not able to formed");
    }

    return 0;
}