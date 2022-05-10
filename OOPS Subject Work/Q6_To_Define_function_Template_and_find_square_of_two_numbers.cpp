#include <bits/stdc++.h>
using namespace std;
template <class T1, class T2>
void square_of_number(T1 Number1, T2 Number2)
{
    T1 square_number1;
    T2 square_number2;
    square_number1 = pow(Number1, 2);
    square_number2 = pow(Number2, 2);

    cout << "The square of the first number is :- " << square_number1 << endl;
    cout << "The square of the second number is :- " << square_number2 << endl;
}

int main()
{
    int choice;
    do
    {
        cout << "1. Square of the integer number" << endl;
        cout << "2. Square of the float number" << endl;
        cout << "3. exit" << endl;
        cout << endl;
        cout << endl;
        cout << "Enter your choice :- ";
        cin >> choice;
        switch (choice)
        {
        case 1:
        {

            int number1, number2;
            cout << "Enter two integer numbers :- ";
            cin >> number1 >> number2;
            square_of_number(number1, number2);
            break;
        }
        case 2:
        {

            float number1, number2;
            cout << "Enter two float numbers :- ";
            cin >> number1 >> number2;
            square_of_number(number1, number2);
            break;
        }
        case 3:
        {
            break;
        }

        default:
            cout << "Wrong Choice !!!!!!!!!!!!!!!!!!!!!!!!!";
            break;
        }
    } while (choice != 3);
}
