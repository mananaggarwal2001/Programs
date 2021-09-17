#include<bits/stdc++.h>
using namespace std;
class Base{
    int a,b;
    public:
        Base(int num1,int num2): a(num1),b(a+num2){ // constructor initilization.
            cout<<"The value of the A is: "<<a<<endl;
            cout<<"The Value of the B is: "<<b<<endl;
        }

        void displayData(){
            cout<<"The value of the A is: "<<a<<endl;
            cout<<"The value of the B  "<<b<<endl;

        }
};
int main()
{

    Base name(12,23);
    name.displayData();
    return 0;
}