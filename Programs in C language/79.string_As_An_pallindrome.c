#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main(){
    int length=0;
    printf("Enter the Length of the string : ");
    scanf("%d",&length);
    char arr[length];
    char arr2[length];
    int i=0;
    int j=0;
    bool flag=false;
    printf("Enter the string : ");
    scanf("%[^\n]%*c", arr);

    for(i=0;i<length;i++){
        printf(arr[i]);
    }
    for(i=0;i!='\0';i++){
        for(j=length-1;j>0;j--){
            if(arr[i]==arr[j]){
                flag=true;
                break;
            }
        }
    }
    if(flag){
        printf("The String is the pallindromic String");

    }else{
        printf("The String is not the pallindromic string");
    }
}