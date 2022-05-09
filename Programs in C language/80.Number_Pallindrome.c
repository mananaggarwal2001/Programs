#include<stdio.h>
#include<String.h>
#include<stdbool.h>
int main(){
    long number=0;
    printf("Enter the Number : ");
    scanf("%ld",&number);
    char Number[50];
    char reverseNumber[50];
    itoa(number,Number,10); // convert the number to the string
    int i=0;
    bool flag=false;
    for(i=0;i<5;i++){
        if (Number[i]==)
        {
            flag=true;
            break;
        }

    }
    if(flag){
        printf("The Number is the Pallindrome");
    }else{
        printf("The Number is not the pallindrome");
    }
}