#include <bits/stdc++.h>
using namespace std;
class stringClass
{
    char str1[50];
    char str2[50];

public:
    stringClass()
    {
        cout << "Enter the String s1:- ";
        cin.getline(str1, 50);
        cout << "Enter the String s2:- ";
        cin.getline(str2, 50);
    }
    void operator+();           // to perform the concatenation of the string
    void operator=(char *str);  // to carry out the string copy
    void operator<=(char *str); // to compare the two strings.
    void display_length_of_string();
    void to_lower();
    void to_upper();
};

void stringClass::operator+()
{

    strcat(str1, str2);
    cout << "The Combined String is :- " << str1 << endl;
}

void stringClass::operator=(char *str)
{
    strcpy(str1, str);
    cout << "The Original String is :- " << str << endl;
    cout << "The Copied String is str1 :- " << str1 << endl;
}
void stringClass::operator<=(char *str)
{
    if (strcmp(str, str1) == 0)
    {
        cout << "Both String are equal ";
    }
    else
    {
        cout << "Both String are not equal";
    }
}

void stringClass::operator<=(char *str)
{
    int result = strcmp(str, str1);
    if (result == 0)
    {
        cout << "Both String are equal" << endl;
    }
    else if (result > 0)
    {
        cout << "The String given in the function is greater than the string given in the class" << endl;
    }
    else if (result < 0)
    {
        cout << "The String given in the class is greater than the string given in the function" << endl;
    }
}

void stringClass::display_length_of_string()
{
    
}

int main()
{
    int choice;
    stringClass object;
    do
    {
        cout << "1. To Perform the concatenation of  the string" << endl;
        cout << "2. To check whether both the strings are equal or not" << endl;
        cout << "3. To compare the two strings and tell which is greater and which is smaller" << endl;
        cout << "4. To display the length of the string" << endl;
        cout << "5. To change upper case characters to the lowercase characters." << endl;
        cout << "6. To change the lowercase characters to the Upper case characters." << endl;
        cout << "7. Exit";
        cout << endl;
        cout << endl;
        cout << "Enter your choice:- ";
        cin >> choice;
        switch (choice)
        {
        case 1:
        {
            object.operator+();
            break;
        }
        case 2:
        {
            /* code */
            break;
        }
        case 3:
        {
            /* code */
            break;
        }
        case 4:
        {
            /* code */
            break;
        }
        case 5:
        {
            /* code */
            break;
        }
        case 6:
        {
            /* code */
            break;
        }
        case 7:
        {
            /* code */
            break;
        }

        default:
            cout << "Wrong Choice !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
            break;
        }
    } while (choice != 7);
}