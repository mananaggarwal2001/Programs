#include <bits/stdc++.h>
using namespace std;
template <class T1 = float, class T2 = int> // template with default parameters introduction
class manan
{
public:
    T1 a;
    T2 b;
    manan(T1 num1, T2 num2)
    {
        a = num1;
        b = num2;
    }
    void display()
    {
        cout << "The Value of the a is: " << a << endl;
        cout << "The Value of the b is: " << b << endl;
    }
};
int main()
{
    manan<> name(4, 2.4);
    name.display();
    return 0;
}