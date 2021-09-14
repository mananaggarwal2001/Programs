#include <bits/stdc++.h>
using namespace std;
class Employee
{
private:
    int a, b, c;

public:
    int d, e;
    void set_Data(int a, int b, int c);
    void get_data()
    {
        cout << "The number of a is: " << a<<endl;
        cout << "The number of b is: " << b<<endl;
        cout << "The number of c is: " << c<<endl;
        cout << "The number of d is: " << d<<endl;
        cout << "The number of e is: " << e<<endl;
    }
};

void Employee ::set_Data(int a1, int b1, int c1)
{
    a=a1;
    b=b1;
    c=c1;
}

int main()
{

    Employee Naman;
    // Naman.a=12; This will throw an error as a is private.
    Naman.d=12;
    Naman.e=56;
    Naman.set_Data(12,23,34);
    Naman.get_data();

    return 0;
}