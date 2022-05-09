#include <stdio.h>
int main()
{
    int number, duplicateNumber, count = 0;
    printf("Enter the Number: ");
    scanf("%d", &number);
    duplicateNumber = number;
    while (duplicateNumber != 0)
    {
        duplicateNumber /= 10;
        count++;
    }
    int array[count], remainder, i = 0, j = 0, temp = 0;
    int frequencyarray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, frequencyCount = 0;
    duplicateNumber = number;
    while (duplicateNumber != 0)
    {
        remainder = duplicateNumber % 10;
        array[i] = remainder;
        duplicateNumber /= 10;
        i++;
    }

    for (i = 0; i < count; i++)
    {
        for (j = 0; j < count; j++)
        {
            if (array[i] < array[j])
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    for (i = 0; i < 10; i++)
    {
        for (j = 0; j < count; j++){
            if(frequencyarray[i]==array[j]){
                frequencyCount++;
            }
        }
        printf("Frequency of %d digit is: %d\n",frequencyarray[i],frequencyCount);
        frequencyCount=0;
    }
}