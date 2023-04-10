/*Q1. Wap to create a class ewallet having data members as instance 
member , name , bal amount . Take the input of name and bal
amount from user . Initialize the data member through constructor
and display the ewallet details through show function */

import java.util.*;
class Ewallet
{
	int bal_amt ; String name ;
 		Ewallet(int bal_amt , String name ){
		this.bal_amt = bal_amt;
		this.name = name;
		//static int x = 20 ; error : because we cannot declare a static variable inside a consturctor .
	}
	void show()
	{
		System.out.println(this.bal_amt+"  "+this.name);
	}
	
	
}
class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance amount ");
		int bal_amt = sc.nextInt();
		System.out.println("Enter the name ");
		sc.nextLine();
		String name = sc.nextLine();
		Ewallet e1 = new Ewallet (bal_amt, name);
		e1.show();
	}
}

/*Q2 .WAP to create a class Examination having data members name , reg_no , subject (sub1,sub2,sub3). Create a method CGPA calculator which
will display the cgpa of students with its reg_no and subjects.*/

//import java.util.*;
class Examination
{
 	 	String Name ;
		int reg_no , maths , English , Science;
 		Examination(String Name, int reg_no,int maths ,int Science,int English){
			this.Name = Name;
			this.reg_no = reg_no;
			this.maths = maths ;
			this.English = English;
			this.Science = Science;
		
		}
		void CGPA_Calculator()
		{
			int cgpa = (maths+English+Science)/30;
			System.out.println("Registration no : "+reg_no );
			System.out.println("maths : "+maths);
			System.out.println("Science : "+Science);
			System.out.println("English : "+English);
			System.out.println("THe cgpa of this student is : " +cgpa);
		}
	
	
}
class Main2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student : ");
		String Name = sc.nextLine();
		System.out.println("Enter the reg_no");
		int reg_no = sc.nextInt();
		System.out.println("Enter the marks of maths");
		int maths = sc.nextInt();
		System.out.println("Enter the marks of Science");
		int Science = sc.nextInt();
		System.out.println("Enter the marks of English");
		int English = sc.nextInt();
		Examination e1 = new Examination(Name, reg_no,maths,Science , English);
		e1.CGPA_Calculator();
	}
}
class why
{
	static{
		System.out.println("Hello I am from static block");
	}
	
	why(){
		System.out.println("Hello I am from default constructor");
	}
}
class Main3
{
	public static void main(String args[]){
		why w = new why();
	}	
}

class CheckStaticBlock
{
static
{
System.out.println("m from static block");
}
CheckStaticBlock()
{
System.out.println("m from class default constructor" );
}
public static void main(String st[])
{
CheckStaticBlock c=new CheckStaticBlock();
}

}
/*
class CheckStaticBlock2
{
static
{
System.out.println("m from static block");
}
{
System.out.println("m from init block");
}
CheckStaticBlock()
{
System.out.println("m from class default constructor" );
}
public static void main(String st[])
{
CheckStaticBlock c=new CheckStaticBlock();
}

}*/

/*WAP to create a class car having an datamember  speed initialize the speed through initializer block  .Display the speed of car through the default constructor
*/
class Car{

	int speed ;{
		this.speed = 100;
	}
	Car (){
		System.out.println("The speed of the car is " +this.speed);	
	}
	public static void main(String st[]){
		Car c = new Car();
	}
}