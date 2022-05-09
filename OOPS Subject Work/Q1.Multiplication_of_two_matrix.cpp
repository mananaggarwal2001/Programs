#include <bits/stdc++.h>
using namespace std;
class matrix
{
private:
    int matrix1[3][3];
    int matrix2[3][3];
    int sum[3][3];

public:
    void insert_values(); // used to inseert the values and to display the values.
    void multiply();      // used for performing the multiplication of the matrix.
    void display();       // used to display result of the matrix.
};

void matrix::insert_values()
{
    // entering value of the matrix1.
    cout << "Enter the value of the matrix 1:- ";
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> matrix1[i][j];
        }
    }
    cout << endl;
    cout << "Display the values of the Matrix 1:-" << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << matrix1[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;
    cout << "Enter the value of the matrix 2:- ";
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> matrix2[i][j];
        }
    }

    cout << endl;
    cout << "Displaying the value of the matrix 2:-" << endl;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << matrix2[i][j] << " ";
        }
        cout << endl;
    }
}

void matrix::multiply()
{

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            sum[i][j] = 0;
        }
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                sum[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
}

void matrix::display()
{
    cout << "The Resultant Matrix is :-"<<endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout<<sum[i][j]<<" ";
        }

        cout<<endl;

    }

}

int main()
{
    matrix object;
    object.insert_values();
    object.multiply();
    object.display();
}