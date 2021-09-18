#include <bits/stdc++.h>
using namespace std;
class baseClass
{

public:
    int var_base;

    virtual void display() // this will run the display function of the another class as the virtual key will not allow to run the funtion of  the same class.
    {
        cout << "1. The value of the var_base is: " << var_base << endl;
    }
};
class DerivedClass : public baseClass
{
public:
    int var_derived;
    void display()
    {
        cout << "2. The value of the var_base is: " << var_base << endl;
        cout << "2. The value of the var_derived is: " << var_derived << endl;
    }
};

int main()
{
    baseClass *bptr;
    DerivedClass *dptr;
    DerivedClass Dobj;
    bptr = &Dobj;
    bptr->var_base= 34;
    bptr->display(); // base class display will run.
    return 0;
}