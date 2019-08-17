import java.util.*;
class linear_search
{ public static void main(String args[])
  {
    int i,d,count=0; int a[] = new int[5];
    System.out.println("enter the 5 numbers as intial input ");
    Scanner s = new Scanner(System.in);
    for(i=0;i<5;i++)
     {
       
       a[i]=s.nextInt();
     }
   System.out.println("enter the number you want to search");
   d=s.nextInt();
   for (i=0;i<5;i++)
    {
      if (a[i]==d)
       count++;
    }
    if(count==1)
      System.out.println("yes , the number is present");
    else
      System.out.println("No , the number isnt there");
  }

}
