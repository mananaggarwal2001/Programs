#include <stdio.h>
#include <conio.h>
 struct student
    {
        int rollno;
        char name[40];
        int marks;
    } a[100];
void main()
{
    int n, i;
    printf("enter the no. of students ");
    scanf("%d", &n);
    printf("enter roll no., name, marks ");
    for (i = 0; i < n; i++)
        scanf("%d %s %d", &a[i].rollno, a[i].name, &a[i].marks);
    for (i = 0; i < n; i++)
        printf("\n%d\t%s\t%d", a[i].rollno, a[i].name, a[i].marks);
    getch();
}
