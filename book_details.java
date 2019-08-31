import java.util.*;
import java.lang.Math;

class book
{
	public static String name;
	public static String author;
	public static double price;
	public static int num_pages;
       book()
      {
    	name="xx";
	    author="xx";
      price = 0.00;
 	     num_pages=0;
      }
     book(String  n , String a , double p , int n_p)
      {
     	name = n ;
      author= a;
	   price = p;
	   num_pages= n_p;
     } 

   public void set()
   {
  Scanner s = new Scanner(System.in);
  System.out.println("enter the name of the book");
 name = s.next();
 System.out.println("enter the name of the author");
 author = s.next();
 System.out.println("enter the price of  the book");
 price =s.nextDouble();
 System.out.println("how many pages does the book contain ?");
 num_pages=s.nextInt();
}

public void get()
{
  System.out.println("Name :"+name);
 System.out.println("Author :"+author);
System.out.println("Price :"+price);
System.out.println("Number of pages :"+num_pages);

}
}

class book_demo1
{ 
   public static void main(String args[])
      {
 
      book b1 = new  book("Prathibha","R",999,100);
      b1.set();
      b1.get();
      }
}
 
