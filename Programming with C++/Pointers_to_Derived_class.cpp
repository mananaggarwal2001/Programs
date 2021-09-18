#include <bits/stdc++.h>
using namespace std;
class baseClass
{

public:
    int var_base;

    void display()
    {
        cout << "The value of the var_base is: " << var_base << endl;
    }
};
class DerivedClass : public baseClass
{

public:
    int var_derived;
    void display()
    {
        cout << "The value of the var_base is: " << var_base << endl;
        cout << "The value of the var_derived is: " << var_derived << endl;
    }
};
int main()
{
    baseClass *base_pointer;
    baseClass obj_base;
    DerivedClass derive_object;
    DerivedClass * derive_pointer;
        base_pointer = &derive_object; // Late binding concept :
                                       // if we point the pointer of base class to the derived class then also the pointer will run the functions of the base class irrespective of where we are pointing  the base class pointer  or any class pointer.

    base_pointer->var_base = 34;
    // base_pointer-> var_derived=23; // will throw an eroor as the pointer is of the base class.
    // base_pointer->display(); // Late binding
    // derive_pointer= &obj_base; // will throw an error
    derive_pointer= &derive_object;
    derive_pointer->var_derived= 2700;
    derive_pointer->display(); // run time polymorphism example which display function will run will be decided during the running of the program.


    return 0;
}