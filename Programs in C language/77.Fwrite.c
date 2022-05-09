#include<conio.h>
#include <stdio.h>
#include<stdlib.h>
struct Student
{
    int roll;
    char name[25];
    float marks;
} ob;
int main()
{
    FILE *fp;
    char cp;
    fp = fopen("Student.dat", "a");
    if (fp == NULL)
    {
        printf("Can't open the file or the file does not exist");
        exit(0);
    }
    do
    {
        printf("\nEnter RollNo: ");
        scanf("%d",&ob.roll);
        printf("Enter the name: ");
        scanf("%s",ob.name);
        printf("Enter the marks: ");
        scanf("%f",&ob.marks);
        fwrite(&ob,sizeof(ob),1,fp);
        printf("\nDo you want to write More data in the file: ");
        cp=getche();

    }while(cp=='y'|| cp=='Y');
    printf("\nData written sucessfully");
    fclose(fp);
    getchar();
}