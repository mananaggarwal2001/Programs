#include<stdio.h>
#define a 100
int main(){
#if(a==100)
printf("The line will be added in the c file since a is equal to 100 ");
#else
printf("The line will be added in the c file since a is not equal to 100 ");
#endif
return 0;
}