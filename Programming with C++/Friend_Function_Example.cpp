#include <bits/stdc++.h>
using namespace std;
// Forward Decelartion
class Y; // Tells Compiler that the Y is present here.
class X
{
    int data;
    friend void add (X,Y);
public:
    void setValue(int value)
    {
        data = value;
    }
};

class Y
{
    int num;
    friend void add (X,Y);

public:
    void setValue(int value)
    {
        num = value;
    }
};

void add(X o1,Y o2){
    cout<<"The sum of the data of the classes X and Y is: "<< o1.data + o2.num;
}
int main()
{
    X x1;
    Y y1;
    x1.setValue(10);
    y1.setValue(20);
    add(x1,y1);

    return 0;
}