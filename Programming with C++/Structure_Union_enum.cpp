#include <bits/stdc++.h>
using namespace std;
// typedef changes the notation in the c++.
typedef struct employee
{
    int employeeNumber;
    int number;
    float salary;
} ep;
union money
{
    int employeeNumber;
    int number;
    float salary;
}; // for better memory management union is used as memory is shared within the data types.

int main()
{
    enum meal
    {
        breakfast,
        lunch,
        dinner
    };
    meal m1= breakfast;
    meal m2= lunch;
    meal m3= dinner;
    cout<<m1<<endl;
    cout<<m2<<endl;
    cout<<m3<<endl;

    // ep manan;
    // manan.employeeNumber=720;
    // manan.number= 12;
    // manan.salary= 12000000000000;
    // cout<<"The Value of "<<manan.employeeNumber<<endl;
    // cout<<"The Value of "<<manan.number<<endl;
    // cout<<"The Value of "<<manan.salary<<endl;

    // money mananMoney;
    // mananMoney.employeeNumber= 123;
    // cout<<mananMoney.employeeNumber<<endl;
    // mananMoney.salary= 12345;
    // cout<<mananMoney.salary<<endl;
    // cout<<mananMoney.employeeNumber<<endl; // The garbage value is shown as the salary variable overwrite the employeeNumber variable as memory is shared within the values.
    // return 0;
}