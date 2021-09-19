#include <bits/stdc++.h>
using namespace std;
template <class T>
class Manan
{
public:
    T Harry;
    Manan(T a)
    {
        Harry = a;
    }
    void display();
};
template <class T>
void Manan<T>::display() // syntax for defining the function outside the class with template.
{
    cout << "The data is: " << Harry << endl;
}

void function(int a)
{
    cout<<"This is the func() of given data: "<<a<<endl;
}
template<class T>
void function(T a)
{
    cout<<"This is the templatised func() of given data: "<<a<<endl;
}

template<class T>
void function1(T a){

    cout<<"This is the templatised func() of given data: "<<a<<endl;
}
int main()
{
    // Manan<int> H(5);
    // cout << H.Harry << endl;
    // H.display();

    // function(4);
    function1(4.0);
    // exact match takes the highest priority then the template class comes into play.
    return 0;
}