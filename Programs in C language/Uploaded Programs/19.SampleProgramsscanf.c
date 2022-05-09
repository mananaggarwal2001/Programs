#include<stdio.h>
int main(){
    // declaring array s
    char s[]= "3 red balls and 2 blue balls ";
    char str[30],str2[50];
    int i;
    sscanf(s,"%d%*s%*s%s%s",&i,str,str2);
    printf("%d%s%s",i,str,str2);  // %*s is used to skip a word
    return 0;
}