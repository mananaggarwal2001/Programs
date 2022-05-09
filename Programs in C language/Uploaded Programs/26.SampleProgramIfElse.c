#include<stdio.h>
int main(){
    int a=100;
    if(a==10){
        printf("Value of a is 10\n");
    }else if(a==20){
        printf("Value of a is 20\n");
    }else if(a==30){
        printf("Value of a is 30\n");

    }else{
        printf("None of the Value is Matching\n");
        printf("Exact Value of a is : %d\n",a);
    }

    return 0;
}