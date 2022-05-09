#include <stdio.h>
int main()
{
    int number = 0;
    long long sum = 0;
    int count = 1;
    do
    {
        printf("Enter the %d Number: ", count);
        scanf("%d", &number);
        sum += number;
        count++;
    }while(number!=0);
    printf("The Sum of the Number is: %lld",sum);
    return 0;
}