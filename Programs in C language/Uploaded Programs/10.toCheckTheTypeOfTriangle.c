#include<stdio.h>
int main(){
    int angle1,angle2,angle3;

    printf("Enter the three angles respectively: ");
    scanf("%d%d%d",&angle1,&angle2,&angle3);
    int sum=angle1+angle2+angle3;
    if(sum==180){
    if((angle1==angle2)&&(angle2==angle3)&&(angle3==angle1)){
        printf("Given Triangle is the equilateral triangle");
    }else if((angle1==angle2)||(angle2==angle3)||(angle3==angle1)){
        printf("Given Triangle is the isoceles triangle");
    }else{
        printf("Given Triangle is the scalene Triangle");
    }
    }else{
        printf("Trinagle is not able to form");
    }

    return 0;
}