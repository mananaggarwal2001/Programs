#include <bits/stdc++.h>
using namespace std;
class Point
{
    int x, y;
    friend float distance(Point, Point);

public:
    Point(int num1, int num2)
    {
        x = num1;
        y = num2;
    }

    void displayPoint()
    {
        cout << "The X coordinate is: " << x << " and the Y Coordinate is: " << y<<endl;
    }
};

float distance(Point p1, Point p2)
{
    float Cal_distance, dis_x,dis_y;
    dis_x= pow((p1.x-p2.x),2);
    dis_y=pow((p1.y-p2.y),2);
    Cal_distance= sqrt(dis_x + dis_y);
    return Cal_distance;
}
int main()
{
    Point p1(1, 0);
    Point p2(70,0);
    p1.displayPoint();
    p2.displayPoint();
    cout<<endl;
    cout<<"The distance between two points is: "<<distance(p1,p2);

    return 0;
}