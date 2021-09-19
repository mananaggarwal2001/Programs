#include<bits/stdc++.h>
using namespace std;
template<class T1,class T2> // function template is same as the class template
float funcAvg(T1 a,T2 b){
    float avg= (a+b)/2.0; // average of the two numbers.
    return avg;
}

template<class T> // it will detect the datatype automatically automatically and gives the required result.
void swapp(T &a,T &b){
    T temp=a;
    a=b;
    b=temp;
}
int main()
{
    float retAvg= funcAvg(30.23,40.34);

    printf("The Average of the two numbers is: %.3f\n",retAvg); // return the value of the upto 3 decimals places.

    int a=12,b=13;
    cout<<"Values before swapping is: "<<a<<" , "<<b<<endl;
    swapp(a,b);
    cout<<"Values after swapping is: "<<a<<" , "<<b<<endl;

    return 0;
}