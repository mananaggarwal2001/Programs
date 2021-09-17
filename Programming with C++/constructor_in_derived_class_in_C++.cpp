#include <bits/stdc++.h>
using namespace std;
class Base1
{
    int data;

public:
    Base1(int i)
    {
        data = i;
        cout << "Base 1 Class constructor called" << endl;
    }
    void printdata()
    {
        cout << "The Value of the data is: " << data << endl;
    }
};

class Base2
{
    int data2;

public:
    Base2(int number)
    {
        data2 = number;
        cout << "Base 2 Class constructor called"<<endl;
    }
    void printdata2()
    {
        cout << "The Value of the data 2 is: " << data2 << endl;
    }
};

class derived : public Base1, public Base2 // constructors are called in the sequence of the program execution.
{
    int derived1,derived2;

public:
    derived(int a,int b,int c,int d): Base1(a),Base2(b){ // inherted Constructor called syntax in the derived class.
        derived1=c;
        derived2=d;
        cout<<"Derived Class constructor Called"<<endl;
    }
    void printDerivedData(){
        cout<<"The value of the Derived 1 is : "<<derived1<<endl;
        cout<<"The value of the Derived 2 is: "<<derived2<<endl;
    }
};
int main()
{
    derived manan(1,2,3,4);
    manan.printdata();
    manan.printdata2();
    manan.printDerivedData();

    return 0;
}