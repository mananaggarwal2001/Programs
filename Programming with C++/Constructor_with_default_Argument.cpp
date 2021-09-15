#include <bits/stdc++.h>
using namespace std;
class simple
{
    int data1;
    int data2;

public:
    simple(int a, int b=10)  // constructor with the default Arguments
    {
        data1 = a;
        data2 = b;
    }
    void printData();
};

void simple ::printData()
{
    cout<<"The data in the a is: "<<data1<<" and the data in the b is: "<<data2<<endl;
}

int main()
{
    simple s1(1);
    s1.printData();
    return 0;
}