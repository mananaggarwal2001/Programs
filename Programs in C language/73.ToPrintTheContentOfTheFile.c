#include <stdio.h>
#include <conio.h>
int main()
{
    FILE *fp;
    char ch;
    fp = fopen("one.txt", "w");
    printf("Enter the data:");
    if (fp)
    {
         fp = fopen("one.txt", "r");
        while ((ch = getc(fp)) != EOF)
            printf("%c", ch);
    }
    else if (!fp)
    {
        fp = fopen("one.txt", "w");
        printf("Enter data: ");
        while ((ch = getchar()) != EOF)
        {
            putc(ch, fp);
        }
    }
    fclose(fp);
    getchar();
}