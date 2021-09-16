#include <bits/stdc++.h>
using namespace std;
class student
{
protected:
    int roll_Number;

public:
    void set_Number(int a)
    {
        roll_Number = a;
    }
    void print_rollNumber()
    {
        cout << "Your roll Number is: " << roll_Number << endl;
    }
};
class test : virtual public student
{
protected:
    float maths, physics;

public:
    void set_marks(int num1, int num2)
    {
        maths = num1;
        physics = num2;
    }
    void print_marks()
    {
        cout << "Your result is here:" << endl
             << "Maths: " << maths << " out of 100" << endl
             << "Physics: " << physics << " out of 100" << endl;
    }
};

class sports : virtual public student
{
protected:
    float score;

public:
    void set_score(float marks)
    {
        score = marks;
    }
    void print_score()
    {
        cout <<"PT Score: "<< score << " out of 100 ";
    }
};

class result : public test, public sports
{
private:
    float total_score, percentage;

public:
    void display()
    {
        total_score= maths + physics + score;
        percentage= total_score/3;
        print_rollNumber();
        cout<<endl;
        print_marks();
        print_score();


        cout<<endl;
        cout<<endl;
        cout<<"Total_score: "<<total_score<<" out of 300"<<endl;
        cout<<"Percentage is: "<<percentage<<"%"<<endl;
    }
};
int main()
{
    result manan;
    manan.set_Number(12);
    manan.set_marks(50,50);
    manan.set_score(67);
    manan.display();
    return 0;
}