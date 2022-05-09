# include<stdio.h>
int factorial(int number){
    if(number==1){
        return 1;
    }else{
        return number * factorial(number-1);
    }
}

int main()
{
    int number=0,Fact=0;
    printf("Enter the Number is : ");
    scanf("%d",&number);
    Fact= factorial(number);
    printf("The factorial of a number %d is:  %d ", number,Fact);
}