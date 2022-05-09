#include <stdio.h>
int sum = 0;
int sumofNumbers(int number)
{
    if (number != 0)
    {
        return number + sumofNumbers(number - 1);
    }
    else
    {
        return number;
    }
}

int main()
{
    int number=0;
    printf("Enter the number for Which you want the sum: ");
    scanf("%d",&number);
    sum= sumofNumbers(number);
    printf("The sum of the given Number %d : %d", number,sum);
}