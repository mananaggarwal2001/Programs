#include <bits/stdc++.h>
using namespace std;
class Complex
{
    int a, b;

public:
    Complex()      // Construction overloading
    {
        a = 0;
        b = 0;
    }
    Complex(int, int);
    Complex(int num1)
    {
        a = num1;
        b = 0;
    }
    void displayData()
    {
        cout << "Your complex Number is: " << a << " + " << b << "i" << endl;
    }
};

Complex::Complex(int num1, int num2)
{
    a = num1;
    b = num2;
}

int main()
{
    Complex a1;
    a1.displayData();
    Complex c1(5);
    c1.displayData();
    return 0;
}