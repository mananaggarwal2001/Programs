#include<stdio.h>
int main(){
    int number,sum,i;
    for(i=0;i<10;i++){
        printf("Enter the %d Number: ",i+1);
        scanf("%d",&number);
        if(number>0){
            sum+=number;
        }else{
            printf("The Sum Of the Numbers are: %d\n",sum);
            continue;
        }
    }

}