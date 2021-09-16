#include <bits/stdc++.h>
using namespace std;
class Base1
{
public:
    void greet()
    {
        cout << "How are you" << endl;
    }
};

class Base2
{
public:
    void greet()
    {
        cout << "Kaise ho?" << endl;
    }
};
class Derived : public Base1, public Base2
{
    int a;

public:
    void greet() // resolving the ambiguity in the derived class.
    {
       Base1 :: greet();
    }
};

class B
{
    int a;
public:
    void say()
    {
        cout << "hello world"<<endl;
    }
};

class Der: public B
{
    int b;
    public:
    void say()
    {
        cout << "Manan is a super hero"<<endl;
    }
};
int main()
{
    // Ambiguity 1 Example.
    Base1 obj1;
    Base2 obj2;
    obj1.greet();
    obj2.greet();
    Derived Der;
    Der.greet();

    // Ambiguity 2 Example
    // B hello;
    // Der manan;
    // hello.say();
    // Der's Class method will automatically override the B's class method.
//     manan.say();
//     return 0;
}