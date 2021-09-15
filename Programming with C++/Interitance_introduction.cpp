#include <bits/stdc++.h>
using namespace std;
class Employee
{ // Base Class
    public:
    float salary;
    int id;
    Employee(){}
    Employee(int id_number){
            id=id_number;
            salary=34.0;
        }
        void display(){
            cout<<"The Employee id is : "<<id<<" and  the Employee Salary is: "<<salary<<endl;
        }

};

// Derived Class of the programmer
// 1. Default visiblity mode is private
// 2. Private members are never inherited.

class Programmer : public Employee{
    public:
    int languageCode;
    Programmer(int inp_id){ // This will try to invoke the default constructer of  the base class.
        id=inp_id;
        languageCode=9;
    }
};

int main()
{

    Employee Manan(12),aman(13);
    Manan.display();
    aman.display();

    Programmer imran(12);
    imran.display();
    cout<<imran.languageCode;
    float name;
    return 0;
}