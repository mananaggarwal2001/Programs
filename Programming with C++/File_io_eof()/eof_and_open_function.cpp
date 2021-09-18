#include<bits/stdc++.h>
using namespace std;
int main()
{
    ofstream ofile;
    ofile.open("Sample.txt");
    ofile<<"The file is to heavy"<<endl;
    ofile<<"File version 2.0 is writing the file automatically"<<endl;
    ofile.close();

    // reading the file
    string fileContent ,fileContentContinue;
    ifstream ifile;
    ifile.open("Sample.txt");
    // getline(ifile,fileContent);
    // getline(ifile,fileContentContinue);
    // cout<<fileContent<<endl<<fileContentContinue;
    //eof introduction
    while (ifile.eof()==0) // condition of the eof for reading the file continuesly.
    {
        getline(ifile,fileContent); // eof condition is true when the file.eof()==0 
        cout<<fileContent<<endl;
    }

    ifile.close();
    return 0;
}