/*WAP to create a class examination having a method 
display taking three argument */
import java.util.*;
class Examination 
{
	static void display (String name, int reg, float cgpa)
	{
		System.out.println("Name of the Student is : "+
		name+ "Reg num of Student : "+reg+ "CGPA of the student is : "+cgpa);
	}
	public static void main (String st[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = s.next();
		System.out.println("Enter the Reg num");
		int reg = s.nextInt();
 		System.out.println("Enter the cgpa");
		float cgpa = s.nextFloat();
		display(name,reg,cgpa);
		
	}
}
class Examination1
{
	public static void main(String a[])
	{
		System.out.println('A'+'A'+" Year "+2022+1);
		System.out.println(2022+1+" Year " + 2022+1);
		System.out.println(10+10.1 + "Year " + 2022+1);
	}
}

class DataTypeDemo
{
	
	public static void main(String st[])
	{
		byte b = 127 ;
		System.out.println(b);
		b++;//It will be 128 as per range 
		System.out.println(b);//cos of cyclic nature the val is -128
	      //byte b1 = 128;CTE cos of range 
		byte b1 = (byte)128;//ur using cating so it will take the cyclic nature 
		System.out.println(b1);
		byte a = 20;
		byte c = 2;
		//byte r = a*c ;//The result ll b in it so type casting is required 
		byte r = (byte)(a*c);
		System.out.println(r);
		short s = 10*10;
		System.out.println(s);
		short s1 = 10;
		short s2 = 10;
		short s3 = (short )(s1*s2);
		System.out.println(s3);
		byte q = 10*10;
		long l1 = 10;
  		long l2 = 10;
		long l3 = l1*l2;
		System.out.println(l3);
		float f1 = 10;
		System.out.println(f1);
		//float f2 =10.1;// f is mandatory with flaot decimal
		float f2 = 10.1f;
		System.out.println(f2);
		double d1 = 10.5d;//d is not mandatory 
		double d2 = 10.5;
		System.out.println(d1+"\t"+d2);
		char c1 = 65;
		System.out.println(c1);
		char w = 'B';
		w++;
		System.out.println(w);
		//char c3 = 10.5f;error
		char c3 = (int)10.5;
		System.out.println(c3);
		float f4 = 5.9999999999f;
		System.out.println(f4);
		float f5 = 5.123456789f;
		System.out.println(f5);
		
		
		
	}
}
