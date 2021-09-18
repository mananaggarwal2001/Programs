#include<bits/stdc++.h>
using namespace std;
int main()
{
    string st2;
    // // opening files using constructor.
    // string st= "manan bhai";
    // ofstream out("Sample.txt"); // write operation
    // out<<st; // file was written in the folder

    // reading from the file and extracting the data from it.
    ifstream ifile("Sample2.txt");
//    ifile>>st2;// only read the first word from the file.
   getline(ifile,st2); // this function is used for reading the file liny by line.

   cout<<st2;


    return 0;
}