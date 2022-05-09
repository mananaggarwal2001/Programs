#include <stdio.h>
#define MAX_ROWS 3
#define MAX_COLS 3
int main()
{
    int array[MAX_ROWS][MAX_COLS];
    int row, col, isUpper;
    printf("Enter elements in matrix of size %dx%d: \n", MAX_ROWS,
           MAX_COLS);
    for (row = 0; row < MAX_ROWS; row++)
    {
        for (col = 0; col < MAX_COLS; col++)
        {
            scanf("%d", &array[row][col]);
        }
    }

    isUpper = 1;
    for (row = 0; row < MAX_ROWS; row++)
    {
        for (col = 0; col < MAX_COLS; col++)
        {
            if (col < row && array[row][col] != 0)
            {
                isUpper = 0;
            }
        }
    }
    if (isUpper == 1)
    {
        printf("\nThe matrix is Upper triangular matrix.\n");
    }
    else
    {
        printf("\nThe matrix is not Upper triangular matrix.");
    }
    return 0;
}