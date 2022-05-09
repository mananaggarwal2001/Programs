#include<stdio.h>
int a = 7; /* global */
int main()
{
int b = 5; /* local */
{
int c = 3;
printf("%d,%d,%d", a, b, c);
}
// printf("%d,%d,%d", a, b, c); /* c is no longer available
// here */
}