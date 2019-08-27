#include<stdio.h>
#include<stdlib.h>
#define max 100
int isfull(int *r)
{ if ( *r==(max-1))
    return 1;
else
  return 0;
}
int isempty(int *f , int *r)
{
    if(( *f==1)&&( *r=-1))
      return 1;
    else 
     return 0;
     
}
void peak (int Q[max],int *f)
{
    printf("The first member is %d ",Q[*f]) ;
}
void enqueue(int Q[max] , int *f ,int *r)
{   int x;   
  printf("enter the number you want to add\n ");
     scanf("%d",&x);    
    if(isfull(&r))
     printf("Queue is full\n");
    else if(isempty(&f,&r))
    {
        *f =*r=0;
    }
    else 
    { *r = *r+1;
    }
     Q[*r]=x;
}

void dequeue(int *f , int *r)
{
    if (isempty(&f,&r))
     return ;
    else if ( *f == *r)
    {
        *f =*r = -1;
    }
    else 
    *f = *f +1;
}
void display(int *r,int *f,int Q[max])
 {
  int i;
   printf("elements of queue\n");

  for(i=*f;i<=*r;i=i+1)
   {
   printf("%d  ",Q[i]);
   }
 }

int main ()
{   int f ,r =-1;int i =1;
    int Q[max] ,exit=1; int n ;
    
    
    while(exit==1)
   
   {
     printf("\nenter 1) To enqueue 2)To dequeue 3) Display 4)To display the first member 5)Exit\n");
    scanf("%d",&n);
       switch(n)
     {
        case 1:{
                enqueue(Q,&f,&r);
                break;
               } 
        case 2:{
                 dequeue(&f,&r);
                printf("the first member of queue is removed \n");
                }       
                break;
        case 3:
               display(&r,&f,Q);
               break;
        case 4:
               peak(Q,&f);
               break;
        case 5 : exit =0;
                 break;
        default : printf("enter a valid choice\n");
     }
   };
}
