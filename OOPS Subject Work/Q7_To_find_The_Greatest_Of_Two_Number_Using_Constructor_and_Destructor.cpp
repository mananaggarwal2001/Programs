#include <bits/stdc++.h>
using namespace std;
class greatest_of_Two_number
{
private:
    int number1;
    int number2;

public:
    greatest_of_Two_number(int num1, int num2) // constructor class is called
    {
        number1 = num1;
        number2 = num2;
    }

    void greatest_number();
    ~greatest_of_Two_number()
    {
        cout << "Destructor Class is called"; // destructor class is called
    }
};

void greatest_of_Two_number::greatest_number()
{
    if (number1 > number2)
    {
        cout << "Number 1 is greater than Number 2:- " << number1<<endl;
    }
    else if (number2 > number1)
    {
        cout << "Number 2 is greater than Number 1:- " << number2<<endl;
    }
    else
    {
        cout<<"Both Number is equal"<<endl;
    }
}

int main()
{
    int num1,num2;
    cout<<"Enter the number 1:- ";
    cin>>num1;
    cout<<"Enter the number 2:- ";
    cin>>num2;
    greatest_of_Two_number object(num1,num2);
    object.greatest_number();
}