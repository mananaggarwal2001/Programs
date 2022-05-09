#include<stdio.h>
void function1();
void function2();
#pragma startup function1
#pragma exit function2
int main()
{
printf("Now we are in the main function\n");
return 0;
}
void function1()
{
    printf("Now we are in the function 1\n");
}
void function2()
{
    printf("Now we are in the function 2\n");
}