#include<stdio.h>
int main(){
    char buffer[100];
    int sum,a,b;
    printf("Enter the two Numbers: ");
    scanf("%d%d",&a,&b);
    sum=a+b;
    sprintf(buffer,"Sum of %d and %d is %d",a,b,sum);
    printf("%s",buffer);
    return 0;
}