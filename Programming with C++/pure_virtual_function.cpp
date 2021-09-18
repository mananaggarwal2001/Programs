#include <bits/stdc++.h>
using namespace std;
class codeWithHarry
{
protected:
    string title;
    float rating;

public:
    codeWithHarry(){};
    codeWithHarry(string s, float r)
    {
        title = s;
        rating = r;
    }
    virtual void display()=0; //do-nothing function pure virtual function decelaration.
};

class codeWithHarryVideo : public codeWithHarry
{
protected:
    int videoLength;

public:
    codeWithHarryVideo(string s, float r, int vl) : codeWithHarry(s, r)
    {
        videoLength = vl;
    }
    void display()
    {
        cout << "This is an amazing Video with the title: " << title << endl;
        cout << " with Rating: " << rating << " Out of 5" << endl;
        cout << "Length of this video is: " << videoLength << " minutes " << endl;
    }
};
class codeWithHarryText : public codeWithHarry
{
protected:
    int wordsCount;

public:
    codeWithHarryText(string s, float r, int tl) : codeWithHarry(s, r)
    {
        wordsCount = tl;
    }
    void display()
    {
        cout << "This is an amazing text tutorial with the title: " << title << endl;
        cout << "with Rating of : " << rating << " Out of 5" << endl;
        cout << "Numbers of words used in this text tutorial is : " << wordsCount << " words " << endl;
    }
};
int main()
{
    string title;
    float rating;
    int wordcount, vlen;


    title = "django tutorial";
    rating = 4.5;
    vlen = 40;
    codeWithHarryVideo video(title, rating, vlen);
    video.display();

    cout << endl;
    cout << endl;
    cout << endl;


    title = "django tutorial textual";
    rating = 4.5;

    wordcount = 120;
    codeWithHarryText djtext(title, rating, wordcount);
    djtext.display();



    codeWithHarry * ptr[2];
    ptr[0]= &video;
    ptr[1]= &djtext;

    cout<<endl;
    cout<<"****Pointer Calling the function of the class****"<<endl;
    cout<<endl;
    ptr[0]->display();
    cout<<endl;
    ptr[1]->display();


    return 0;
}