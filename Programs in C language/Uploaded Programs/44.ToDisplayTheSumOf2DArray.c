#include <stdio.h>
int main()
{
    int arr1[3][3], arr2[3][3], sum[3][3], i, j;
    for (i = 0; i < 3; i++)
    {
        printf("Row %d initiates\n", i);
        for (j = 0; j < 3; j++)
        {
            printf("Enter the element %d: ", j);
            scanf("%d", &arr1[i][j]);
        }

        printf("\n");
    }

    printf("Array 2 Begins\n ");
    for (i = 0; i < 3; i++)
    {
        printf("Row %d initiates\n", i);
        for (j = 0; j < 3; j++)
        {
            printf("Enter the element %d: ", j);
            scanf("%d", &arr2[i][j]);
        }

        printf("\n");
    }

    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }

        printf("\n");
    }

    printf("The Sum Of the 2 2D array is :\n");

    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d", sum[i][j]);
            printf("  ");
        }

        printf("\n");
    }
}