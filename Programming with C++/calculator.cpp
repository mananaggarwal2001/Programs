#include <bits/stdc++.h>
using namespace std;
class simpleCalculator
{
public:
    float a, b;
    void setNumbers(int, int);
    float add();
    float subtratct();
    float multiply();
    float divide();
};

void simpleCalculator::setNumbers(int number1, int number2)
{
    a = number1;
    b = number2;
}

float simpleCalculator::add()
{
    return (a + b);
}
float simpleCalculator::subtratct()
{
    return (a - b);
}
float simpleCalculator::multiply()
{
    return (a * b);
}
float simpleCalculator::divide()
{
    return (a / b);
}

class scintificCalculator : public simpleCalculator
{
public:
    void square_of_two_numbers();
    void squareroot_of_two_numbers();
};

void scintificCalculator::square_of_two_numbers()
{
    cout << "The Square of the first Number is: " << pow(a, 2)<<endl;
    cout << "The Square of the Second Number is: " << pow(b, 2)<<endl;
}

void scintificCalculator::squareroot_of_two_numbers()
{
    cout << "The Square root of the first Numbers: " << sqrt(a)<<endl;
    cout << "The square root of the Second Numbers: " << sqrt(b)<<endl;
}

class Hybridcalculator : public scintificCalculator
{
public:
    void displayresult();
};
void Hybridcalculator :: displayresult()
{
    cout<<endl;
    cout<<"The sum of Two Numbers is: "<<add()<<endl;
    cout<<"The difference of Two Numbers is: "<<subtratct()<<endl;
    cout<<"The product of Two Numbers is: "<<multiply()<<endl;
    cout<<"The division of Two Numbers is: "<<divide()<<endl;

    cout<<endl;
    squareroot_of_two_numbers();
    square_of_two_numbers();
}
int main()
{
    Hybridcalculator r1;
    float a,b;
    cout<<"Enter the Two Numbers: "<<endl;
    cin>>a>>b;
    r1.setNumbers(a,b);
    r1.displayresult();
    return 0;
}