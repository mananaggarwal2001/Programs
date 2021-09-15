#include<bits/stdc++.h>
using namespace std;
class Complex
{
    int a, b;

public:
    Complex(int ,int);
    void displayData()
    {
        cout << "Your complex Number is: " << a << " + " << b << "i" << endl;
    }
};

Complex::Complex(int num1,int num2) // This is the Parameterized Constructor
{
    a = num1;
    b = num2;

}

int main()
{
    // Implict call
    Complex a(12,23);

    // Explict Call
    Complex b = Complex(5,7);
    a.displayData();
    b.displayData();
    return 0;
}