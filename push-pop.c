#include<stdio.h>
#define max 30
int item[max] ; int top = -1;
void push(int x)
{
 if (isfull())
   return ;
 else { top++;
 item[top]= x;
 }
 }
void pop()
{
 if(isempty())
   return  ;
 else
 {
 top--;
 }
 }

 int isfull()
 {
 if (top>=max)
 {
 printf("The stack is full");
 return 1;
 }
 else
  return 0;
 }
 int isempty()
 {
 if(top==-1)
 {
 printf("the stack is empty");
 return 1;
 }
  else
   return 0;
  }
 void topmost()
 {
 printf("The topmost number is %d\n",item[top] );
 }
 void display()
 {
 int i ;
 printf("array =");
 for(i=0;i<=top;i++)
 { printf("%d  ",item[i]);
 }
 printf("\n");
 }
void  main()
{
int c , d , exit=1;

while(exit==1)
{ printf("enter 1)push 2) pop 3)display 4)peak 5)exit\n");
  scanf("%d",&c);
  switch(c)
  {
  case 1:{
	  printf("enter the number to input\n");
	  scanf("%d",&d);
	  push(d);
	  break;
	  }
  case 2: {
	   pop();
	   printf("the topmost number is poped out\n");
	   break;
	   }
  case 3: { display();
	    break;
	    }
  case 4: {
	   topmost();
	   break;
	   }
 case 5 : exit = 0;
	  break;
 default :printf("enter valid choice");
 }
 }
 getch();

}
