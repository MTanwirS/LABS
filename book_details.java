import java.util.*;
public class book
{
	public String name;
	public String author;
	public double price;
	public int num_pages;
       book()
      {
	name="please enter the bookname";
	author="please enter the author name";
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
 name = s.nextLine();
 System.out.println("enter the name of the author");
 author = s.nextLine();
 System.out.println("enter the price of  the book");
 price =s.nextDouble();
 System.out.println("how many pages does the book contain ?");
 num_pages=s.nextInt();
 book b1 = new  book( name , author , price , num_pages);
}

public void get()
{System.out.println("Name :"+name);
System.out.println("Author :"+author);
System.out.println("Price :"+price);
System.out.println("Number of pages :"+num_pages);

}
public static void main(String args[])
{ int i,h;
 
 System.out.println("enter the number of books");
 Scanner s = new Scanner(System.in);
  h = s.nextInt();
  book b1 = new book(); 
 for (i=0;i<=h;i++)
 {
    
   b1.set();
   b1.get();
 
 } 
 
} 
}

 
 
