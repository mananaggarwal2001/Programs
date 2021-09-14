#include <bits/stdc++.h>
using namespace std;
class shop
{
private:
    string item_name[100];
    int item_Price[100];
    int counter = 0;

public:
    void initCounter()
    {
        counter = 0;
    }
    bool setPrice(void);
    void DisplayPrice(void);

} ob;

bool shop::setPrice(void)
{
    string name="yes";
    while (name =="yes")
    {
        cout << "Enter Id of your item no "<<counter+1<<" : ";
        cin >> item_name[counter];
        cout << "Enter the Price of the item no "<<counter+1<< " : ";
        cin >> item_Price[counter];
        counter++;
        cout << "Do you want to enter more items: ";
        cin >> name;
    }
}

void shop::DisplayPrice(void)
{
    cout<<"*****************Display Counter is open****************************"<<endl;
    for (int i = 0; i < counter; i++)
    {
        cout << "The Id of the item is: " << item_name[i] << endl;
        cout << "The Price of the item is: " << item_Price[i] << endl;
        cout << endl;
    }
}

int main()
{
    shop Manan;
    Manan.setPrice();
    Manan.DisplayPrice();
    return 0;
}