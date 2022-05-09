#include<stdlib.h>
#include<stdio.h>

int main(){
    int num;
    printf("Enter the Number: ");
    scanf("%d",&num);
    if(num>0){
        printf("number is positive");
    }else if(num<0){
        printf("Number is negative");
    }else{
        printf("Number is zero");
    }
}