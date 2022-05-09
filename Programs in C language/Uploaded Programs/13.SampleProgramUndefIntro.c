#include<stdio.h>
#define height 100
int main()
{
printf("First Define height is: %d\n",height);
#undef height     // undefining the variable
#define height 60 // redefining the same variable.
printf("The newly defined height after redefining is: %d",height);
return 0;
}