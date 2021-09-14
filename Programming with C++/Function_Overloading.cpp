#include <bits/stdc++.h>
using namespace std;
int sum(int a, int b)
{
    cout << "Using the function with 2 Arguments";
    return a + b;
}
int sum(int a, int b, int c)
{
    cout << "Using the function with 3 Arguments";
    return a + b + c;
}

// Example of function overloading
// Volume of cylinder
int volume(double r, double h)
{
    cout<<"The volume of cylinder is: "<<endl;
    return(3.14 * r *r * h);
}
// Volume of cube.
int volume(double a){
    cout<<"The volume of cube is: "<<endl;
    return ( a * a * a);
}
// volume of cuboid
int volume(int length,int breadth,int height){
    cout<<"The volume of rectangle is: "<<endl;
    return ( length * breadth * height);
}
int main()
{
    cout << "The sum of 3 and 6 is" << sum(3, 6) << endl;
    cout << "The sum of 3,6 and 7" << sum(3, 6, 7) << endl;
    cout<<"The volume of cylinder is: \n"<<volume(12,23)<<endl;
    cout<<"The volume of cube is: \n"<<volume(12)<<endl;
    cout<<"The volume of cuboid is: \n"<<volume(12,23,10)<<endl;

    return 0;
}