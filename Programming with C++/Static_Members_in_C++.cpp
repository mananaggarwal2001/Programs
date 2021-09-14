#include <bits/stdc++.h>
using namespace std;
class Employee
{
    int id;
    static int count;

public:
    void getData(void)
    {
        cout << "Enter the data of the Employee: ";
        cin >> id;
        count++;
    }
    void displayData(void)
    {
        cout << "The id of the employee is " << id << " and the Employee Number is " << count << endl;
    }
    static void getCount(void)
    {
        // cout<<id; Throws an error and the normal member is not accessible.
        cout<<"The value of the get count is: "<<count<<endl;
    }
};

int Employee ::count = 1000; // static variable value can be change here.
int main()
{
    Employee Manan, Aman, Sarthak;
    Manan.getData();
    Employee::getCount; // Format to access the static member function.
    Manan.displayData();
    Aman.getData();
    Aman.displayData();
    Sarthak.getData();
    Sarthak.displayData();
    return 0;
}