# include<stdio.h>
void swap(int*n1,int*n2){
    int temp;
    temp=*n1;
    *n1=*n2;
    *n2=temp;
}
int main(){
    int num1=5,num2=10;
    swap(&num1,&num2);
    printf("The Num1 Value is: %d\n", num1);
    printf("The Num2 Value is: %d", num2);
}