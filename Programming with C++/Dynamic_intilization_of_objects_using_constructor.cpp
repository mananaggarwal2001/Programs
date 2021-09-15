#include <bits/stdc++.h>
using namespace std;
class bankdeposit
{
    int principal;
    int years;
    float interestRate;
    float returnValue;

public:
    bankdeposit(void);
    bankdeposit(int p, int y, float r);
    bankdeposit(int p, int y, int r);
    void show(void);
};

bankdeposit ::bankdeposit(int p, int y, float r)
{
    principal = p;
    years = y;
    interestRate = r;
    returnValue = principal;
    for (int i = 0; i < y; i++)
    {
        returnValue = returnValue * (1 + interestRate);
    }
}

bankdeposit ::bankdeposit(int p, int y, int r)
{
    principal = p;
    years = y;
    interestRate = float(r) / 100;
    returnValue = principal;
    for (int i = 0; i < y; i++)
    {
        returnValue = returnValue * (1 + interestRate);
    }
}

bankdeposit::bankdeposit()
{
    principal=1;
    interestRate=1;
    years= 1;

}

void bankdeposit ::show(void)
{
    cout<<endl;
    cout <<"Principal Amount was: " << principal
         <<" and the return value after " << years
         <<" years is " << returnValue << endl;
}
int main()
{
    bankdeposit bd1, bd2, bd3;
    int p, y;
    float r;
    int R;
    cout << "Enter the Principal Value: ";
    cin >> p;
    cout << "Enter the Numbers of Years of deposition: ";
    cin >> y;
    cout << "Enter the Rate Value: ";
    cin >> r;

    bd1 = bankdeposit(p, y, r);
    bd1.show();

    cout<<"*******Integer Constructor in working here********"<<endl;
    cout << "Enter the Principal Value: ";
    cin >> p;
    cout << "Enter the Numbers of Years of deposition: ";
    cin >> y;
    cout << "Enter the Rate Value: ";
    cin >> R;
    bd2=bankdeposit(p,y,R);
    bd2.show();

    return 0;
}