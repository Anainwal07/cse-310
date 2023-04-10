import java.util.*;
class InputDemo
{
	public static void main(String []a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int");
		int i = sc.nextInt();
		System.out.println("Enter the float");
		float f = sc.nextFloat();
		System.out.println("Enter the double");
		double d = sc.nextDouble();
		System.out.println("Enter the long");
		long l = sc.nextLong();
		System.out.println("Enter the String");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("Enter the String type value");
		String w = sc.next();

		System.out.println("int : " +i);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		System.out.println("long : "+l);
		System.out.println("String : "+s);
		System.out.println("String : "+w);
	}
}
/* Write a program to take the input from the user the no int type and check whether the no is odd or even*/
class evenodd
{
	public static void main(String []a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer ");
		int i = sc.nextInt();
		if(i%2==0)
		{
			System.out.println("The number is even "); 
		}
		else
		{
			System.out.println("The number is odd ");
		}
	}
}
/*To find if the integer is prime number or not */
class primeno
{
	public static void main(String []a)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int f = 0 ; 
		for(int i= 2 ; i<n; i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		if(f>0)
		{
			System.out.println("The number is Prime "); 
		}
		else
		{
			System.out.println("The number is not Prime ");
		}
	}
}
/* wtp with a clss name student having two methods get value and show value . get value will take two parameters name and registration no . Show the 
Entered value in show value . Take the input from the user and shwo the final details of the student .*/

class Student 
{
	void get(String name , int reg)
	{
		System.out.println("Student name is " +name+ "\t" + "Student registration no is : " +reg);
	}
	public static void main(String []a)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of hte student " );
		String name = s.nextLine();
		System.out.println("Enter the registration number " );
		int reg = s.nextInt();
		new Student().get(name,reg);
	}
}

