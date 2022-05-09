#include <stdio.h>
#include <conio.h>
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
    fp = fopen("Student.dat", "r");

    if (fp == NULL)
    {
        printf("\nCan't open file or file doesn't exist.");
        exit(0);
    }
    printf("\n\tRoll\tName\tMarks\n");
    while (fread(&ob, sizeof(ob), 1, fp) > 0)
        printf("\n\t%d\t%s\t%f",ob.roll, ob.name, ob.marks);
    fclose(fp);
}