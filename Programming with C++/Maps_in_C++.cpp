#include <bits/stdc++.h>
using namespace std;
// map is an associative array
int main()
{
    map<string, int> marksMap;
    marksMap["Harry"] = 99;
    marksMap["Jack"] = 59;
    marksMap["Rohan"] = 2;

    map<string, int>::iterator iter;
    marksMap.insert({{"Manan",100},{"Naman",23}}); // Method used for inserting the values.
    for (iter = marksMap.begin(); iter != marksMap.end(); iter++)
    {
        cout << (*iter).first << " " << (*iter).second << endl; // for key we use = (*iter).first
                                                                // for value we use=(*iter).second
    }
cout<<endl;
cout<<"Map max size is: "<<marksMap.max_size();

    return 0;
}