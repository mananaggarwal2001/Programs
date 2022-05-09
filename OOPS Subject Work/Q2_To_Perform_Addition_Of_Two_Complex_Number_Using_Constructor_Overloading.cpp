// menu driven Program of the addition of  the complex Number.
#include <bits/stdc++.h>
using namespace std;
class complexClass
{
private:
    int real_Number1;
    int imaginary_Number1;
    int real_Number2;
    int imaginary_number2;
    int sum_of_real_number = 0;
    int sum_of_imaginary_number = 0;

public:
    complexClass() // first constructor when the default object of  the class is made.
    {
        cout << "Enter the First Real Number:- ";
        cin >> real_Number1;
        cout << "Enter the Second Real Number:- ";
        cin >> real_Number2;
        cout << "Enter the First imaginary Number:- ";
        cin >> imaginary_Number1;
        cout << "Enter the Second imaginary Number:- ";
        cin >> imaginary_number2;
    }

    complexClass(int number) // second constructor
    {
        real_Number1 = number;
        imaginary_Number1 = number;
        real_Number2 = number;
        imaginary_number2 = number;
    }
    complexClass(int real_number, int imaginary_number) // third constructor
    {
        real_Number1 = real_number;
        imaginary_Number1 = imaginary_number;
        real_Number2 = real_number;
        imaginary_number2 = imaginary_number;
    }

    void sum_of_complex_number();
    void display();
};

void complexClass ::sum_of_complex_number()
{
    sum_of_real_number = real_Number1 + real_Number2;
    sum_of_imaginary_number = imaginary_Number1 + imaginary_number2;
}

void complexClass::display()
{
    cout << "The Resultant complex Number is :- " << sum_of_real_number << " + " << sum_of_imaginary_number << "i" << endl;
}

int main()
{
    int choice;
    do
    {
        cout << "1. No Number is Entered for calculation" << endl;
        cout << "2. Enter only 1 Number for calculation" << endl;
        cout << "3. Enter real and imaginary number both for calculation" << endl;
        cout << "4. Exit" << endl;
        cout << endl;
        cout << "Enter your choice :- ";
        cin >> choice;
        switch (choice)
        {
        case 1:
        {
            complexClass object;
            object.sum_of_complex_number();
            object.display();
            break;
        }
        case 2:
        {
            int number;
            cout << "Enter the Number:- ";
            cin >> number;
            complexClass object(number);
            object.sum_of_complex_number();
            object.display();
            break;
        }
        case 3:
        {
            int real, imaginary;
            cout << "Enter the real Number:- ";
            cin >> real;
            cout << "Enter the imaginary Number:- ";
            cin >> imaginary;
            complexClass object(real, imaginary);
            object.sum_of_complex_number();
            object.display();
            break;
        }
        case 4:
        {
            break;
        }

        default:
            cout << "Wrong Choice !!!!!!!!!!!!!!!!!!!!!!!";
            break;
        }
    } while (choice != 4);
}