#include<bits/stdc++.h>
using namespace std;
int main()
{
    int array[4]= {1,2,3,4};
    int* p = array;
    cout<<"The value of *p is "<<*p<<endl;
    cout<<"The value of *(p+1) is "<<*(p+1)<<endl;
    cout<<"The value of *(p+2) is "<<*(p+2)<<endl;
    cout<<"The value of *(p+3) is "<<*(p+3)<<endl;


    // cout<<array[0]<<endl;
    // cout<<array[1]<<endl;
    // cout<<array[2]<<endl;
    // cout<<array[3]<<endl;


    // for (int i = 0; i < 4; i++)
    // {
    //     cout<<"The value of the "<<i<<" is "<<array[i]<<endl;
    // }

    // // pointer and the array.
    // int *b=array;
    // cout<<*(b++)<<endl; // this will print the value of the array and increament the value in the array in the next line.
    // cout<<*b<<endl;// This will print the value in the array which is increamented in the first line.
    // cout<<"The value of the *b "<<*b<<endl;  // This will print the value present in the array
    // cout<<"The Value of the *(b+1) "<<*(b+1)<<endl;
    // cout<<"The Value of the *(b+2) "<<*(b+2)<<endl;
    // cout<<"The Value of the *(b+3) "<<*(b+3)<<endl;


    return 0;

}