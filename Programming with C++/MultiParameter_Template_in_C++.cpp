#include <bits/stdc++.h>
using namespace std;
template <class t1, class t2> // class templates with multiple parameters.
class myClass
{
public:
    t1 data1;
    t2 data2;
    myClass(){};
    myClass(t1 d1, t2 d2)
    {
        data1 = d1;
        data2 = d2;
    }
    void display()
    {
        cout << "The data1 variable value is: " << data1 << endl;
        cout << "The data2 variable value is: " << data2 << endl;
    }
};
int main()
{
    myClass<int ,char> N1(1,'Q');
    N1.display();
    return 0;
}