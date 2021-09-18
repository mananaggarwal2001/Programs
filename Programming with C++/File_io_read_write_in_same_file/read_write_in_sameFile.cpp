#include <bits/stdc++.h>
using namespace std;
int main()
{
    // connecting out file with our hout stream
    ofstream out("Sample60.txt");
    string name;
    cout << "Enter your name: ";
    // filling our file with the string variable.
    cin >> name;

    // writing the string to the file.
    out << " My Name is: " << name << endl;
    cout << "File is Closed" << endl;
    out.close();
    cout << endl;
    cout << endl;
    cout << endl;
    cout << endl;
    // reading the file
    cout << ":::::::::The content of the file is given below::::::" << endl;
    ifstream ifile("Sample60.txt");
    string str;
    getline(ifile, str);
    cout << str;
    ifile.close();
    return 0;
}