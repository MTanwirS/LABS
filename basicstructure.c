#include <stdio.h>
#define n 10

struct student
{
    char name[20];
    char usn[10];
    int year;
    int marks[5];
};
 int  main()
 { 
    int i,j;
     struct student s1;
     printf("enter the name \n ");
    scanf("%s",&s1.name[i]);
     printf("enter the usn \n");
     scanf("%s",&s1.usn);
     printf("enter the year \n");
     scanf("%d",&s1.year); 
     printf("enter the subject marks in DS,MP,COA,DM,LD");
     for(i=0;i<=4;i++)
     {
       scanf("%d",&s1.marks[i]);
     }
     printf("******student info****** \n");
     printf("Name : %s \n",s1.name);
     printf("USN : %s \n ",s1.usn);
     printf("Year = %d\n",s1.year);
     for(j=0;j<=4;j++)
     {
       printf("sub %d = %d \n ",(j+1),s1.marks[j]);
     }
     return 0;
 }
