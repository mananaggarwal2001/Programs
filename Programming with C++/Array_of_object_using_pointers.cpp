#include <bits/stdc++.h>
using namespace std;
class Shop
{
    int id;
    float price;

public:
    void set_Data(int a, int b)
    {
        id = a;
        price = b;
    }
    void get_data(int i)
    {
        cout << "The id of the item "<<i<< " is  : " << id << endl;
        cout << "The price of the item is: " << price << endl;
    }
};
int main()
{
    Shop *ptr = new Shop[4];
    int id;
    float cost;
    for (int i = 0; i < 4; i++)
    {
        cout << "Enter the id of the " << i + 1 << " item: ";
        cin >> id;
        cout << "Enter the price of the " << i + 1 << " item: ";
        cin >> cost;
        (ptr + i)->set_Data(id, cost);
        cout << endl;
    }
    for (int i = 0; i < 4; i++)
    {
        (ptr + i)->get_data((i+1));
        cout<<endl;
    }

    return 0;
}