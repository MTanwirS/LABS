import java.util.*;
class student_sgpa_calculator 
{
  String usn;
  String name;
 int[] array_marks = new int[8];
 int[] grade_points = new int[8];
int[] array_credits = new int[]{4,4,4,4,3,3,1,2}; 
 float sgpa;

 void accept_data()
{int i=0;
Scanner s = new Scanner(System.in);
System.out.println("enter your name");
name= s.nextLine();
System.out.println("enter the usn");
usn = s.nextLine();
System.out.println("enter your marks in :");
System.out.println("DM :");
array_marks[i++]=s.nextInt();
System.out.println("MP:");
array_marks[i++]=s.nextInt();
System.out.println("OOJ:");
array_marks[i++]=s.nextInt();
System.out.println("DS:");
array_marks[i++]=s.nextInt();
System.out.println("COA:");
array_marks[i++]=s.nextInt();
System.out.println("LD:");
array_marks[i++]=s.nextInt();
System.out.println("CIPE :");
array_marks[i++]=s.nextInt();
System.out.println("Pw :");
array_marks[i++]=s.nextInt();
}

  void sgpa_calculator()
{int i=0;
float sum=0;
  
	for(i=0;i<=7;i++)
    {
  if (array_marks[i]>=90 && array_marks[i]<=100)
   grade_points[i]=10;
  else if (array_marks[i]>=80 && array_marks[i]<90)
     grade_points[i]=9;
  else if (array_marks[i]>=70 && array_marks[i]<80)
     grade_points[i]=8;
  else if (array_marks[i]>=60 && array_marks[i]<70)
     grade_points[i]=7;
  else if (array_marks[i]>=50 && array_marks[i]<60)
     grade_points[i]=6;
  else if (array_marks[i]>=40 && array_marks[i]<50)
     grade_points[i]=4;
  else 
     grade_points[i]=0;
  }
  for (i=0;i<=7;i++)
{
sum = sum+(array_credits[i]*grade_points[i]);
}
 sgpa = sum / 25;
}


 void display()
{
System.out.println("Name :"+name);
System.out.println("USN :"+usn);
System.out.println("SGPA :"+sgpa);
}
public void main(String args[])
{ 
accept_data();
sgpa_calculator();
display();
}
}
