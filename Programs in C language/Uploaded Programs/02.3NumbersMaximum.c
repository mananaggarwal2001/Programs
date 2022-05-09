#include<stdlib.h>
#include<stdio.h>

int main(){
    int num1,num2,num3;
    printf("Enter the three numbers: ");
    scanf("%d%d%d",&num1,&num2,&num3);

    if(num1>num2 && num1>num3){
        printf("num1 is the largest");
    }else if(num2>num3 && num2>num1){
        printf("num2 is the largest");

    }else if(num3>num2 && num3>num1){
        printf("num3 is the largest");
    }
    return 0;
}