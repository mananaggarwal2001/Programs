#include<stdio.h>
int main(){
    int a,b;
    printf("Enter the Two Numbers: ");
    scanf("%d%d",&a,&b);
    int c=0;
c = a & b;
printf("Line 1 - Value of c is %d\n", c );
c = a | b;
printf("Line 2 - Value of c is %d\n", c );
c = a ^ b;
printf("Line 3 - Value of c is %d\n", c );
c = ~a; // 1's complement.
printf("Line 4 - Value of c is %d\n", c );
c = a << 2;
printf("Line 5 - Value of c is %d\n", c );
c = a >> 2;
printf("Line 6 - Value of c is %d\n", c );
}