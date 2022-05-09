#include <stdio.h>
int main()
{
    int number, i;
    printf("Enter the Number: ");
    scanf("%d", &number);
    printf("The Factors of the given Number %d: \n", number);
    for (i = 2; i <= number-1; i++)
    {
        if (number % i == 0)
        {
            printf("%d\n", i);

        }
    }
}