#include <bits/stdc++.h>
using namespace std;
int factorial(int a)
{
    if (a <= 1)
    {
        return 1;
    }
    else
    {
        return a * factorial(a - 1);
    }
}

int fibonacci(int number_of_terms)
{
    if (number_of_terms == 0 || number_of_terms == 1)
    {
        return 1;
    }
    else
    {
        return fibonacci(number_of_terms - 2) + fibonacci(number_of_terms - 1);
    }
}
int main()
{
    // factorial of a number using the recursion
    int a, fibonacci_Number;
    cout << "Enter the number: ";
    cin >> a;

    cout << "Enter the fibonacci number: ";
    cin >> fibonacci_Number;
    cout << "The factorial of " << a << " is: " << factorial(a)<<endl;
    cout << "The fibonacci sum of the number is: " << fibonacci(fibonacci_Number)<<endl;

    return 0;
}