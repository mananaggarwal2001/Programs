#include <stdio.h>
#include <conio.h>
struct emp
{
    char name[10];
    int age;
} ob;

int main()
{
    FILE *q;
    q = fopen("two.txt", "a+");
    printf("Enter the name and the age:");
    scanf("%s %d", ob.name, ob.age);
    fprintf(q, "%s %d", ob.name, ob.age);
    do
    {
        fscanf(q, "%s %d", ob.name, ob.age);
        printf("%s %d", ob.name, ob.age);
    } while (!feof(q));
    fclose(q);
    getch();
}