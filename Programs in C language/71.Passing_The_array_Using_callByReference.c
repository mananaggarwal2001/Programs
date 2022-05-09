#include <stdio.h>
void display(int *num)
{
    printf("%d\n",*num);

}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int i = 0; i < 9; i++)
    {
        display(&arr[i]);
    }
    return 0;
}