#include<bits/stdc++.h>
using namespace std;
template<class T1,class T2> // Template class is being used.
class square_class
{
    T1 First_Number; // data type is being used 
    T2 Second_Number;
public:
    square_class(T1 number1,T2 number2){
        First_Number=number1;
        Second_Number=number2;
    }
    void square_of_two_number();
    void display();
}; 
void square_class:: square_of_two_number(){
    T1 square_number1;
    T2 square_number2;
    square_number1= pow(First_Number,2);
    square_number2= pow(Second_Number,2);

}
int main(){
    square_class object(12,13);
    object.square_of_two_numbers();
}