#include <bits/stdc++.h>
using namespace std;
// template<class T>
void display(list<int> &L1)
{
    list<int>::iterator iter;
    for (iter = L1.begin(); iter != L1.end(); iter++)
    {
        cout << *iter << endl;
    }
}
int main()
{
    // types of list decelaration.
    list<int> list1;    // list of zero length.
    list<int> list2(3); // Empty list of 5 elements.
    int size, element;
    cout << "Enter the Number of elements which you want to insert: ";
    cin >> size;

    for (int i = 0; i < size; i++)
    {
        cout << "Enter the element " << i + 1 << " which you want to enter in the list: ";
        cin >> element;
        list1.push_back(element);
    }

    // display(list1);
    // removing element from the list
    // list1.pop_back();
    // list1.pop_front();
    // list1.remove(23);
    // cout<<"After removing the element the remaing element is: "<<endl;

    // sorting the list.
    // list1.sort(); // sorts the list in the ascending order.
    // reversing the list
    // list1.reverse();
    list<int>::iterator iter = list2.begin();
    *iter = 12;
    iter++;
    *iter = 25;
    iter++;
    *iter = 30;
    iter++;
    cout<<endl;
    // merging the list:
    list1.merge(list2);
    list1.sort();
    cout<<"After merging and sorting the list"<<endl;
    display(list1);

    // list<int>::iterator iter;
    // iter = list1.begin();
    // cout << *iter << endl; // it will point to the first element of the list and print its.
    // iter++;
    // cout << *iter;

    return 0;
}