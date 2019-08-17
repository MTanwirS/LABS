import java.util.*;
class fibonacci
{
 public static void main(String args[])
 {  
   int a =0, b=1,n,c,i;
    System.out.println("How many fibonacci numbers do you want to print?");
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
System.out.print(a+","+b);
for (i=0;i<=n;i=i+2)
{ 
  c= a+b;
  System.out.print(","+c);
  a=b;
  b=c;
}
}
}
  
  
