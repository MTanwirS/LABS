import java.util.*;
import java.lang.Math;
class bank
{
public String name;
public String acc_no;
public double balance=0;


public void get_data()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name");
	name= s.next();
	System.out.println("Enter your Account Number");

}

public void debit()
{        Scanner a = new Scanner(System.in);
	 System.out.println("Enter the amount to be debited");
	 float d = a.nextFloat();
	 balance=balance+d;
}

public void withdrawal()
{
	 Scanner a = new Scanner(System.in);
	 System.out.println("Enter the amount to be debited");
	 float w = a.nextFloat();
	 balance=balance-w;
}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("Account Number :"+acc_no);
	System.out.println("available balance :"+balance);
}
}



class savings_acc extends bank
{
private int r = 5 ;
public double ci;

	public void ci()
	{
			ci=balance*(Math.pow((1+r) , 2));//assuming the duration of time is 2 years
			System.out.println("the compound interest earned is :Rs. "+ci);
			System.out.println("Your balance after including compound interest is :Rs. "+(balance+ci));
	}

}




class current_acc extends bank
{
	public void  min_balance()
	{ 
			  if(balance<=1000)
			  System.out.println("Please maintain the minimum balance to avoid extra charges");
			 
	}


}


class demo_bank
{
	public static void main(String args[])
	{ 
		int exit=1 ; int c , e = 0 ;int a=1;
		System.out.println("Welcome to xyz bank of india");
		bank b = new bank();
		savings_acc sav = new savings_acc();
		current_acc cur = new current_acc();
		while (a==1)
           {
		Scanner s = new Scanner(System.in);
		System.out.println("Hey , Do you want to login into 1) savings account 2)current account Please enter your choice");
		e=s.nextInt();
		if((e!=1)&&(e!=2))
                System.out.println("enter a valid choice");
                else 
                a=0;
	  }
 		 

               b.get_data();

		while(exit==1)
		{
			System.out.println("Do you want to 1) debit cash 2) withdraw cash 3) know my account details 4)To go back to home window ");
			Scanner s = new Scanner(System.in);
			c = s.nextInt();
			switch(c)
			{
				 case 1: b.debit();
					  break;
				 case 2: b.withdrawal();
					 break;
				 case 3 :b.display();
					 if(e==1)
					{ 
					 sav.ci();
					 System.out.println("Since you have a savings bank account, there is NO CHECK-BOOK FACILITY ");
					}
					else 
					{
					 cur.min_balance();
			                 System.out.println("Since you have a current bank account, there is  CHECK-BOOK FACILITY , please avail the same");
					 break;
					}
				case 4: exit = 0;
					break;
				default : System.out.println("Please enter a valid option");
			}
    }
  }
}




 

	
