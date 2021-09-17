#include <bits/stdc++.h>
using namespace std;

class Complex
{
    int real, imaginary;

public:
    void getdata()
    {
        cout << "The real part is: " << real << endl;
        cout << "The imaginary part is: " << imaginary << endl;
    }

    void set_Data(int r, int i)
    {
        real = r;
        imaginary = i;
    }
};

int main()
{
    Complex c1;
    c1.set_Data(12, 23);
    Complex *ptr = &c1;
    (*ptr).set_Data(12, 23); // . operator has the higher precendence than the *
    (*ptr).getdata();

    // // object dynamically initializing
    // Complex *mtr= new Complex();
    // // (*mtr).set_Data(12,23); is same as
    // mtr->set_Data(12,23); // arrow operator is same as (*mtr).set_Data(12,23); to access the function of class objects.
    // (*mtr).getdata();

    Complex *mtr = new Complex[4];
    mtr->set_Data(112, 345);
    mtr->getdata();
    cout << endl;
    (mtr + 1)->set_Data(113, 390);
    (mtr + 1)->getdata();

    return 0;
}