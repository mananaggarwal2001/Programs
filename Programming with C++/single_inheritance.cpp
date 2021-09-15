#include <bits/stdc++.h>
using namespace std;
int data1;
int data2;
class base
{
public:
    int getData1();
    int getData2();
};

class Derived : public base
{ // class is being derived publically
    int data3;

public:
    void setData(void);
    void process();
    void display();
};

void Derived::setData(void)
{
    data1 = 10;
    data2 = 20;
}
int base::getData1()
{
    return data1;
}
int base::getData2()
{
    return data2;
}
void Derived::process()
{
    data3 = data2 * getData1();
}

void Derived ::display()
{
    cout << "The Value of the Data 1 " << getData1() << endl;
    cout << "The Value of the Data 2 " << getData2() << endl;
    cout << "The Value of the Data 3 " << data3 << endl;
}
int main()
{
    Derived der;
    der.setData();
    der.process();
    der.display();
    return 0;
}