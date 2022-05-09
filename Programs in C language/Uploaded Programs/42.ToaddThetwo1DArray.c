#include <stdio.h>
int main()
{
    int arr1[10], arr2[10], SumArray[10], i;
    for (i = 0; i < 10; i++)
    {
        printf("Enter the %d Element: ", i);
        scanf("%d", &arr1[i]);
    }
    printf("\n");
    printf("Second Array Entry Starts From : ");
    printf("\n");
    for (i = 0; i < 10; i++)
    {
        printf("Enter the %d Element: ", i);
        scanf("%d", &arr2[i]);
    }

    for (i = 0; i < 10; i++)
    {
        SumArray[i] = arr1[i] + arr2[i];
    }
    printf("The Sum of the Two Array is: ");
    for (i = 0; i < 10; i++)
    {
        printf("%d", SumArray[i]);
        if(i==9){
            printf(" ");
        }else{
            printf(",");
        }
    }
}