#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={12,4,10,1,2};
    // sort(arr,arr+5);
    sort(arr,arr+5,greater<int>()); // for sorting in decending order.
    for(int i=0;i<5;i++){
        cout<<arr[i]<<endl;
    }

    return 0;
}