#include <bits/stdc++.h>
using namespace std;
class LIST
{
public:
    virtual void store() = 0; // virtual Functions is being made here.
    virtual void retreave() = 0;
};

class stackClass : public LIST
{
public:
    void store()
    {
        cout << "Store function is called in the stack Class"<<endl;
    }

    void retreave()
    {
        cout << "Retreave Function is called in the stack Class"<<endl;
    }
};
class queueClass : public LIST
{
public:
    void store()
    {
        cout << "Store function is called in the queue Class"<<endl;
    }

    void retreave()
    {
        cout << "Retreave Function is called in the queue Class"<<endl;
    }
};

int main()
{
    stackClass object1;
    queueClass object2;
    object1.store();
    object1.retreave();
    object2.store();
    object2.retreave();
}