# include<stdio.h>
void disp(char ch){
    printf("%c ",ch);
}
int main(){
   int i;
   char ch[]= {'a','b','c','d','e'};
   for(i=0;i<5;i++){
       disp(ch[i]);
   }
}