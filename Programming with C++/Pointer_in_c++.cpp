#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a=3;
    int *b= &a;
    // & (address of)---> address of operator
    cout<<&a<<endl; // this will print the address of a.
    cout<<b<<endl; // this will show the address of the b.

    // * (dereferencing operator)-----> value at operator
    cout<<*b<<endl; // this will show the value of b.
    int **c= &b;
    // pointer to pointer concept
    cout<<*c<<endl; // This will print address of the b pointing out by c.
    cout<<**c<<endl; // this will print the value holding at the pointer to pointer c
    cout<<c<<endl; // This will print the address of the c pointer.
    return 0;
}