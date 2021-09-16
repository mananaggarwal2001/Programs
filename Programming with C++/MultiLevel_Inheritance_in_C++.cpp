#include <bits/stdc++.h>
using namespace std;
class student
{
    int roll_No;

public:
    void set_roll_number(int);
    void get_roll_number();
};

void student::set_roll_number(int a)
{
    roll_No = a;
}
void student::get_roll_number()
{
    cout << "The roll Number is: " << roll_No << endl;
}

class Exam : public student
{
public:
    float maths;
    float physics;
    void setMarks(float P_marks, float M_marks);
    void get_marks(void);
};

void Exam::setMarks(float marks1, float marks2)
{
    maths = marks1;
    physics = marks2;
}
void Exam::get_marks()
{
    cout << "The marks obtained in maths is: " << maths << endl;
    cout << "The marks obtained in Physics is: " << physics << endl;
}

class result : public Exam
{
    float percentage;

public:
    void display()
    {
        percentage = ((maths + physics) / 200) * 100;
        get_roll_number();
        get_marks();
        cout << "your Percentage is: " << percentage << "%" << endl;
    }
};

int main()
{

    result manan;
    float marks1, marks2;
    int rollNumber;
    cout << "Enter the Roll Number: ";
    cin >> rollNumber;
    cout << "Enter the Marks of maths: ";
    cin >> marks1;
    cout << "Enter the Marks of physics: ";
    cin >> marks2;

    manan.setMarks(marks1, marks2);
    manan.set_roll_number(rollNumber);
    cout << endl;
    manan.display();
    return 0;
}