#include <bits/stdc++.h>
using namespace std;

class num
{
     static int count;
public:
    num()
    {
        count++;
        cout << "This is the " << count << " time when the constructor is called: "<<endl;
    }

    ~num()
    {
        cout << "This is the time when my destructor is invoked this number of times: " << count <<endl;
        count--;
    }
};

int num:: count=0;
int main()
{
    cout << "we are inside our main function " << endl;
    cout << "Creating two objects of the class"<<endl;
    num n1;
    {
        cout<<"Creating two more elements"<<endl;
        num n1,n2;
        cout<<"Exiting this block"<<endl;
    }
    cout<<"back to main"<<endl;
    return 0;
}