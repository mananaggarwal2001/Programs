#include <bits/stdc++.h>
using namespace std;
class base1
{
protected:
    int base1int;

public:
    void setbase1int(int i)
    {
        base1int = i;
    }
};
class base2
{
protected:
    int base2int;

public:
    void setbase2int(int i)
    {
        base2int = i;
    }
};
class base3
{
protected:
    int base3int;

public:
    void setbase3int(int i)
    {
        base3int = i;
    }
};



class derived : public base1, public base2,public base3
{
public:
    void show()
    {
        cout << "The integer value of the base 1: " << base1int << endl;
        cout << "The integer value of the base 2: " << base2int << endl;
        cout<<"the integer value of the base 3: "<<base3int<<endl;
        cout <<"The sum of the base 1 and base 2 is: " << base1int + base2int + base3int<< endl;
    }
};
int main()
{
    derived manan;
    manan.setbase1int(12);
    manan.setbase2int(34);
    manan.setbase3int(40);
    manan.show();
    return 0;
}