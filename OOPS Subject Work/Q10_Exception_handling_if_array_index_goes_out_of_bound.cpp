#include <bits/stdc++.h>
using namespace std;
int main()
{
    int number;
    try
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int size = sizeof(arr) / sizeof(int); // for getting the number of  the elements.
        int index;
        cout << "Enter the index number of the array for which you want to get the element:- ";
        cin >> index;
        if (index > size - 1)
        {
            throw index;
        }
        else
        {
            cout << "The Element Present in the index number " << index << " which is " << arr[index];
        }
    }
    catch (int index)
    {
        cout << "The index number is caught which is " << index; // for caught the index number and showing the array index out of bound error.
    }
}