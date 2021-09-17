#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a=40;
    int* ptr=&a;
    cout<<"The value of the a is : "<<*ptr<<endl;

    // new operator is used for initializing the value dynamically.
    float *b; // syntax for initializing the value dynamically through pointers
    // b= new int(4);
    b= new float(4.2000);
    cout<<"The Dynamic value of at address b is: "<< *b <<endl;

    int *arr=new int[4];
    // arr[0]=10;
    // arr[1]=20;
    // arr[2]=30;

    // we can also write the above statement as:
    *(arr)=10;
    *(arr+1)=20;
    *(arr+2)=30;

    // delete arr; // this will delete the space allocated in the memory.
    cout<<"The value at arr[0] is : "<<arr[0]<<endl;
    cout<<"The value at arr[1] is : "<<arr[1]<<endl;
    cout<<"The value at arr[2] is : "<<arr[2]<<endl;


    return 0;
}