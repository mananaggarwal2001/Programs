#include <bits/stdc++.h>
using namespace std;
class binary
{
private: // by default the member of the class are private.
    string s;
    void display_binary();
    bool chk_binary_onceCompliment(void);
public:
    void read(void);
    void chk_binary();
    void one_s();
};

void binary ::read()
{
    string binary;
    cout << "Enter the binary number: ";
    cin >> s;
}
void binary ::chk_binary()
{
    bool flag = false;
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' && s.at(i) != '1')
        {
            flag = true;
            break;
        }
    }

    if (flag)
    {
        cout << "This is not the Binary Number";
    }
    else
    {
        cout << "This is the Binary Number and the binary Number is: ";
        display_binary();
    }
}

bool binary:: chk_binary_onceCompliment(void){
    bool flag=false;
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' && s.at(i) != '1')
        {
            flag = true;
            break;
        }
    }

    return flag;
}
void binary ::one_s(void)
{
    if(chk_binary_onceCompliment()){
        cout<<"This is not the binary Number";
        return;
    }
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) == '0')
        {
            s.at(i) = '1';
        }
        else if (s.at(i) == '1')
        {
            s.at(i) = '0';
        }
    }
    cout<<"The binary Number after once compliment is: ";
    display_binary();
}

void binary ::display_binary(void)
{
    bool flag= false;

    cout<<s;
}
int main()
{
    binary Manan;
    Manan.read();
    Manan.one_s();
    return 0;
}