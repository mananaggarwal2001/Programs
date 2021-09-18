#include <bits/stdc++.h>
using namespace std;
template<class T> // introduction to the template.
                  // used for passing the data type which is told later by the user.
class Vector
{

public:
    T *arr;  // for repeating the classes we use the template to follow DRY.
    int size;
    Vector(){};
    Vector(int m)
    {
        size = m;
        arr = new T[size];
    }
    T dotProduct(Vector &vec)
    {
        T d = 0;
        for (int i = 0; i < size; i++)
        {
            d += this->arr[i] * vec.arr[i];
        }
        return d;
    }
};

int main()
{
    // v1.arr[0] = 1;
    // v1.arr[1] = 4;
    // v1.arr[2] = 5;

    // Vector v2(3);
    // v2.arr[0] = 1;
    // v2.arr[1] = 0;
    // v2.arr[2] = 1;
    // int a = v1.dotProduct(v2);
    // Vector v1(3);
    // cout << a << endl;

    Vector<float> v1(3);
    v1.arr[0] = 1.4;
    v1.arr[1] = 4.4;
    v1.arr[2] = 5.0;

    Vector<float> v2(3);
    v2.arr[0] = 1.1;
    v2.arr[1] = 0.23;
    v2.arr[2] = 1.12;
    float a = v1.dotProduct(v2);
    cout << a << endl;
    return 0;
}