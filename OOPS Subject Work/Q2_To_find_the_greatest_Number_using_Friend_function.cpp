// to find the greatest of the two number using the friend function.
#include <bits/stdc++.h>
using namespace std;
class compare2;
class compare1
{
    int value1;
    friend void greatestNumber(compare1, compare2); // use of the friend function is shown in this program.

public:
    compare1(int data)
    {
        value1 = data;
    }
};

class compare2
{
    int value2;
    friend void greatestNumber(compare1, compare2);

public:
    compare2(int data)
    {
        value2 = data;
    }
};

void greatestNumber(compare1 c1, compare2 c2)
{
    if (c1.value1 > c2.value2)
    {
        cout << "The value of the class compare1 is greater than the class compare2:- " << c1.value1 << endl;
    }
    else if (c1.value1 < c2.value2)
    {
        cout << "The Value of the class compare2 is greater than the class compare1:- " << c2.value2 << endl;
    }
    else
    {
        cout << "Both are equal" << endl;
    }
}

int main()
{
    int number1, number2;
    cout << "Enter the value of the class compare1:- ";
    cin >> number1;
    cout << "Enter the value of the class compare2:- ";
    cin >> number2;
    compare1 object1(number1);
    compare2 object2(number2);
    greatestNumber(object1, object2);
}
