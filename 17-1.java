//Operators in Java
class Parent{}
class Child extends Parent{}
class TestInstanceOf{
	public static void main(String []rk){
		Parent p = new Parent();
		Child c = new Child();
		System.out.println(p instanceof Child);//false
		System.out.println(p instanceof Parent);//true
		System.out.println(c instanceof Parent);//true
		System.out.println(c instanceof Child );//true
	}	
}
class Test
{
	public static void main(String args[])
	{	
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		System.out.println("a+b = " + (a+b));
		System.out.println("a+b = " + a + b);
		System.out.println("a-b = " + (a-b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a*b = " + a * b);
		System.out.println("b/a = " + (b/a));
		System.out.println("b%a = " + (b%a));
		System.out.println("c%a = " + (c%a));
		System.out.println("a++ = " +(a++));
		System.out.println("a-- = " + (a--));
		char c1 = 'A';
		char c2 = 'A';
		System.out.println("c1 + c2  = " + (c1+c2));
		//check the difference in d++ and ++d
		System.out.println("d = " + d);
		System.out.println("d++ = " + (d++));
		System.out.println("d = " + d);
		System.out.println("++d = " + (++d));
	}
}
class Test2 
{
	public static void main(String args[])
	{
		int a  = 10 ; 
		int b = 20;
		int c = a+b ;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = a+b = " + c);
		c += a;
		System.out.println("c += a = " + c );
		c -=a;
		System.out.println("c -= a = " + c);
		c *= a;
		System.out.println("c *= a = " + c);
		c += a;
		System.out.println("c += a = " + c);
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		c =-a;
		System.out.println("c = -a = " +c);
		c *= a;
		System.out.println("c *= a = " +c);
		a = 10 ; c = 15 ; c /= a;
		System.out.println("c /= a = " + c);
		a = 10; c = 15;  c %= a;
		System.out.println("c %= a = " + c);		
		
	}
}
class Test3
{
	public static void main(String args[])
	{
		boolean a = true;
		boolean b = false;
		System.out.println("a && b = " + (a&&b));
		System.out.println("a || b = " + (a||b));
		System.out.println("!(a && b ) = " + ! (a && b));

	}
}
class Test4
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println("a == b = " +(a==b));
		System.out.println("a!= b= " +(a!=b));
		System.out.println("a>b = " +(a>b));
		System.out.println("a<b = " +(a<b));
		System.out.println("b >= a = " +(b>=a));
		System.out.println("b <= a = " +(b  <= a));
	}
}
class Test5
{
	public static void main(String args[])
	{
		int a , b ;
		a = 10;
		System.out.println("a = " +a);
		b = (a==1)?20:30;
		System.out.println("Value of b is : " +b);
		b = (a==10)?20:30;
		System.out.println("value of b is : " +b);
	}
}
class tryforshift
{
	public static void main(String s[])
	{
		int b =10;
		int res = b>>2;
		int rss = b>>>2;
		byte ress = (byte)rss;
		System.out.println("simple value " +b);
		System.out.println("shift simple "+res);
		System.out.println("shift fill zero simple "+ress);
		 b= 20;
		b = b>>3;
		System.out.println("shift simple " +b);
		b = 20;
		b = b<<3;
		//System.out.println("sh
		//b = -10;
		//b>>>2;
		System.out.println("b>>>2  = "+b);
		//byte b = 30;
		System.out.println(~b);
		//byte b = -53;
		System.out.println(~b);

	}
}
