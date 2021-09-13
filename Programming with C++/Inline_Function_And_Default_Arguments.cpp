#include <bits/stdc++.h>
using namespace std;
inline int product(int a, int b)
{
    static int c = 0; // This will only execute once as it will retain its value for all the function calls.
    c = 12;
    return a * b + 12;
}
// Default Arguments.
float moneyReceived(float currentMoney, float factor=10.08)
{
    return currentMoney * factor;
}
int main()
{
    int a, b;
    cout << "Enter the First Number and the second number" << endl;
    cin >> a >> b;
    cout << "The Product of the a and b is: " << product(a, b)<<endl;
    double money=1000;
    cout<<"\nif you have this money in your bank: "<<money<<" You will receive amount : "<<moneyReceived(money);
    return 0;
}