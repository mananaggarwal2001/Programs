#include <bits/stdc++.h>
using namespace std;
int sum(int a, int b); // function prototype

int main()
{
    int num1, num2;
    cout << "Enter the first number: ";
    cin >> num1;
    cout << "Enter the Second Number: ";
    cin >> num2;
    // Actual Parameters
    cout << "The sum of the 2 Numbers is: " << sum(num1, num2);
    return 0;
}

int sum(int a, int b)
{
    // a and b will take values from the actual parameters num1 and num2.
    int c = a + b;
    return c;
} // function with the return value.