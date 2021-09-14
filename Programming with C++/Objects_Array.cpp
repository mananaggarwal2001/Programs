#include <bits/stdc++.h>
using namespace std;
class Employee
{
    int id;
    int salary;

public:
    void setId()
    {
        salary=122;
        cout<<"Enter the id in the Employee: ";
        cin>>id;
    }
    void getid(){
        cout<<"The id of the Employee is: "<<id<<" and  the salary is: "<<salary;
    }
};
int main()
{
    // Array intialization of objects.
    Employee fb[3];
    for (int  i = 0; i < 3; i++)
    {
        fb[i].setId();
        fb[i].getid();
        cout<<endl;
    }

    return 0;
}