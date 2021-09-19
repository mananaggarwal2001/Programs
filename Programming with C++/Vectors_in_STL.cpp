#include<bits/stdc++.h>
using namespace std;

template<class T>
void display(vector<T> vec){
    for(int i=0;i<vec.size();i++){
        cout<<vec[i]<<endl; // to display the elements present in the vectors.
    }
}
int main()
{
    float element;
    int size;
    // ways to create the vector
    vector<int> vec1; // zero element vector
    vector<float> vec2(4); // 4 elements character vector.
    vector<char> vec3(5); // 5 element characters vector.
    vector<char> vec4(vec3); // characters vec4 from the vec3.
    vector<int> vec5(6,3); // displaying 6 repeated number in vector of a given number.
    display(vec5);
    cout<<"Enter the no of elements which you want to insert: ";
    cin>>size;
    for (int  i = 0; i < size; i++)
    {
        cout<<"Enter element "<<i+1<<" to add to this vector: ";
        cin>>element;
        vec1.push_back(element); // push_back function is used for inserting the element in the vector.
    }
    // iterator function
    display(vec1);
    // vector<float> :: iterator iter= vec1.begin(); // this will start to iterate the vector from beginning.
    // vec1.insert(iter+1,566);
    // cout<<"The Values displayed in the vector after insertion is: "<<endl;
    // display(vec1);


    return 0;
}