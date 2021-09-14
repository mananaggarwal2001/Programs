#include <bits/stdc++.h>
using namespace std;
class Complex
{
    int a, b;

public:
    void setNumber(int n1, int n2)
    {
        a=n1;
        b=n2;
    }
    // below line means that the non members SumComplex is allowed to do anything with my private data.
    friend Complex sumComplex(Complex o1, Complex o2);
    void printNumber(){
        cout<<"The complex Number is: "<<a<<" + "<<b<<"i"<<endl;
    }
};
Complex sumComplex(Complex o1,Complex o2){
    Complex o3;
    o3.setNumber((o1.a+o2.a),(o1.b+o2.b));
    return o3;
}
int main()
{
    Complex c1,c2,sum;
    c1.setNumber(1,2);
    c2.setNumber(3,4);
    c1.printNumber();
    c2.printNumber();
    sum= sumComplex(c1,c2);
    sum.printNumber();
    return 0;
}