#include <stdio.h>
int main()
{
    int n;
    printf("Enter the size of the 1D Array: ");
    scanf("%d", &n);

    int arr1[n], i, j, temp;
    for (i = 0; i < n; i++)
    {
        printf("Enter the %d Element in Array: ", i);
        scanf("%d", &arr1[i]);
    }

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr1[i] > arr1[j])
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
        }
    }
    printf("The Sorted Array is : ");
    for(i=0;i<n;i++){
        printf("%d",arr1[i]);
        if(i==n-1){
            printf(" ");
        }else{
            printf(",");
        }
    }
}