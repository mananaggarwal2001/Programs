#include <bits/stdc++.h>
using namespace std;
class Number
{
    int a;

public:
    Number() {}
    Number(int num)
    {
        a=num;
    }

    // when no copy constructor is found then the compiler will supply its default copy constructor.
    Number(Number &obj){   // copy constructor is made here.
        cout<<"Copy constructor Called"<<endl;
        a=obj.a;
    }
    void display(){
        cout<<"The number for this object is: "<< a <<endl;
    }
};
int main()
{
    Number a(45),z2;
    a.display();
    Number z1(a); // copy constructor invoked.
    z1.display();
    z2=z1; // copy construction will not invoked as the object was already made.
    Number z3=z1; // copy constructor was invoked as the object is being intialized in the same line.
    z3.display();
    return 0;
}