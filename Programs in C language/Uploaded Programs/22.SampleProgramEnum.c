#include<stdio.h>
int main(){
    enum Month{jan=0,feb,Mar};
    enum Month month=Mar;
    if(month==0){
        printf("The Month is January");
    }else if(month==1){
        printf("The Month is Febury");
    }else if(month==2){
        printf("The Month is March");
    }
    return 0;
}