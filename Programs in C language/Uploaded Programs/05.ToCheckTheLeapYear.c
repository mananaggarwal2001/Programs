#include<stdlib.h>
#include<stdio.h>
int main(){
    int year;
    printf("Enter the Year ");
    scanf("%d",&year);
    if((year%100!=0)&&(year%4==0)||(year%400==0)){
        printf("%d is the leap year",year);
    }else{
        printf("%d is not the leap year",year);
    }
}