#include <stdio.h>
#include <conio.h>
#include <stdbool.h>

int main()
{
    int row = 0, coloumn = 0;
    printf("Enter the Number Of the row in the Matrix: ");
    scanf("%d", &row);
    printf("Enter the Number of the Coloumn in the Matrix: ");
    scanf("%d", &coloumn);
    int array[row][coloumn];
    bool flag;

    for (int i = 0; i < row; i++)
    {
        printf("Enter the Elements for the row %d ", i);
        printf("\n");
        for (int j = 0; j < coloumn; j++)
        {
            printf("Enter the Elements for the coloumn %d: ", j);
            scanf("%d", &array[i][j]);
        }
    }
    printf("\n");
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < coloumn; j++)
        {
            printf("%d ", array[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < coloumn; j++)
        {
            if (i != j && array[i][j] == 0)
            {
                flag = true;
            }
        }
    }
    if (flag)
    {
        printf("The given Matrix is the diagnoal Matrix");
    }
    else
    {
        printf("The given Matrix is not the diagnoal Matrix");
    }
}