#include <bits/stdc++.h>
using namespace std;
class A
{
    int a;

public:
    // void set_data(int a)
    // {
    //     this->a=a; // this pointer usage.
    // }
    A& set_data(int a)
    {
        this->a=a; // this pointer usage.
        return *this;
    }
    
    void get_data(){
        cout<<"The value of the A is: "<<a;
    }

};
int main()
{
    A a;
   a.set_data(12).get_data();
    return 0;
}