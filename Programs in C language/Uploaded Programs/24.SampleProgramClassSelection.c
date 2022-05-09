#include<stdio.h>
int main(){
    int age ,YearOfPasssing,Percentage;
    printf("Enter the Age: ");
    scanf("%d",&age);
    printf("Enter the Year Of passing: ");
    scanf("%d",&YearOfPasssing);
    printf("Enter the Percentage: ");
    scanf("%d",&Percentage);
    if(age>=30 && YearOfPasssing<2008){
        printf("Selected in the Class A");
    }else if(Percentage>=70 && YearOfPasssing<2005){
        printf("Selected in the Class B");
    }else if(Percentage<=50 && age>20){
        printf("Selected in the Class C");
    }else{
        printf("Not Selected");
    }
    return 0;
}