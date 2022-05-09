#include<stdio.h>
int main(){
    int num1=30;
    int num2=40;
    if(num1>=40 || num2>=40)
    printf("Or Block Gets Executed\n");
if(num1>=20 && num2>=20)
printf("And Block Gets Executed\n");
if( !(num1>=40))
printf("Not Block Gets Executed\n");
return(0);
}