import java.util.*;
class binary_search
{
 public static void main(String args[])
 {
  int i,d,n; 
    System.out.println("enter the entire count of numbers you want to input");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("enter the numbers as intial input ");
    for(i=0;i<n;i++)
     {
       
       a[i]=s.nextInt();
     }
   System.out.println("enter the number you want to search");
   d=s.nextInt();
   int first=0;
   int last=n-1;
   int mid =(first+last)/2;
while(first<=last)
{   
   if(a[mid]<d)
   {
     first=mid+1;
   }
   else if (a[mid]==d)
   { System.out.println("element found in the position "+(mid+1));
     break;
    }
    else 
   { last=mid-1;
    }
    mid =(first+last)/2;
  }

  if(first>last)
  System.out.println("element not found");
}
}
    
