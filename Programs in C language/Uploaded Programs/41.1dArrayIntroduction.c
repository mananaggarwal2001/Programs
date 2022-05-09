#include <stdio.h>
int main()
{
    int arr1[10], i;
    for (i = 0; i < 10; i++)
    {
        printf("Enter the %d element: ",i);
        scanf("%d", &arr1[i]);
    }

    for (i = 0; i < 10; i++)
    {
        printf("%d\n", arr1[i]);
    }
}