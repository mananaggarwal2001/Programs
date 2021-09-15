#include <bits/stdc++.h>
using namespace std;
class Complex
{
    int a, b;

public:
    Complex(void);
    void displayData()
    {
        cout << "Your complex Number is: " << a << " + " << b << "i" << endl;
    }
};

Complex::Complex(void) // This is the Default Constructor
{
    a = 10;
    b = 10;
    cout<<"hello World"<<endl;
}

int main()
{
    Complex o1,o2,o3;
    o1.displayData();
    o2.displayData();
    o3.displayData();
    return 0;
}