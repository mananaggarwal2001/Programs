#include <stdio.h>
int Swap(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("The Swapped of First Number is: %d\n", a);
    printf("The Swapped of Second Number is %d", b);

}
int main()
{
       int a,b;
       printf("Enter the first Number : ");
       scanf("%d",&a);
       printf("Enter the Second Number : ");
       scanf("%d",&b);
       Swap(a,b);
}