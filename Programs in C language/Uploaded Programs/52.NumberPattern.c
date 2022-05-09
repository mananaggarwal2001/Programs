#include<stdio.h>
int main(){
    int i=0,j=0;
    for(i=0;i<3;i++){
        for(j=3;j>=3-i;j--){
            printf("%d",i);
        }
        printf("\n");
    }
}