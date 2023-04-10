class faculty
{
	public static void main(String... a)
	{	
		
	}
}

/* Q1. WAP to create a class Examination 
- contains a method cgpaofStudent()
	print any cgpa of Student 
-contains the main method 
-Call the method in the main to show the cgpa of Student 
*/
//Ans 1 . Without using static 
class Examination 
{
	void cgpaofStudent()
	{
		System.out.println("MY current cgpa is 0 ");
	}
	public static void main(String a[])
	{
		Examination e = new Examination();
		e.cgpaofStudent();

	}

}
/*Ans2. Using static . In this approach we don't need 
to create an object and call the function directly*/

class Examination2 
{
	static void cgpaofStudent()
	{
		System.out.println("MY current cgpa is 0 ");
	}
	public static void main(String a[])
	{
		//Examination e = new Examination();
		//e.cgpaofStudent();
		cgpaofStudent();

	}

}
/*Ans 3 
*/
class Examination3 
{
	int k ;//Instance var will be having default value 
	static int x ;//Static var will b haing default value
	
	public static void main(String a[])
	{
		int i ;//local variable
		//System.out.println(i);//it will give an error
		//coz local var will not hvae default value 
		//public int x = 200;//local var
		//System.out.println(x);//it will also give an error because we cannot use access specifier with a local variable
		int y = 300;
		//System.out.println(y);
		System.out.println(new Examination3().k);
		System.out.println(x);

	}

}

class VarDemo
{
	static int x = 100;
	public static void main(String []a)
	{
		//static int x = 20;//you cannnot declare static with the local 
		System.out.println(x);
 	}
	void sum()
	{
		//static int a = 20;//error as we cannot declare static variable inside a method 
 	}
	public static void main(String []a)
	{
		int x = 20;
		System.out.println(x);// The output of this call will be 20
		System.out.println(VarDemo.x);//The output of this call will be 100
	}
}
