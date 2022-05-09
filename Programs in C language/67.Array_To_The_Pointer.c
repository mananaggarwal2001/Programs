#include <stdio.h>
int main()
{
    int a[] = {1, 2, 3, 4, 5};
    int *p = a;
    int i = 0;
    for (i = 0; i < 5; i++)
    {
        // printf("%d ", *p);
        // value of the array is printed by:-
        printf("%d\n ", p[i]);
        printf("%d ", p+i);
    }
}