#include <stdio.h>
int main()
{
    int number, count = 0, duplicateNumber, remainder, i = 0;
    printf("Enter the Number: ");
    scanf("%d", &number);
    duplicateNumber = number;
    while (duplicateNumber > 0)
    {
        duplicateNumber /= 10;
        count++;
    }
    int arr[count], arr1[count], j, firstdigit, Lastdigit, SwappedArray[count];
    while (number > 0)
    {
        remainder = number % 10;
        arr[i] = remainder;
        number /= 10;
        i++;
    }
    for (i = 0, j = count - 1; (i < count || j >= 0); i++, j--)
    {
        arr1[i] = arr[j];
    }
    firstdigit = arr1[0];
    Lastdigit = arr1[count - 1];

    SwappedArray[0]=Lastdigit;
    for(i=1;i<=count-2;i++){
        SwappedArray[i]=arr1[i];
    }
    SwappedArray[count-1]=firstdigit;

    for(i=0;i<count;i++){
        printf("%d",SwappedArray[i]);
    }
}