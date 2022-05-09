#include<stdlib.h>
#include<stdio.h>
int main(){
    char ch;
    printf("Enter any Character: ");
    scanf("%c",&ch);
    if((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')){
        printf("%c is the character",ch);
    }else if((ch>='0'&&ch<='9')){
        printf("%c is the digit",ch);

    }else{
        printf("%c is the Special Character");
    }
    return 0;
}