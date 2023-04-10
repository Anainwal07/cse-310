class Test 
{
	public static void main(String args[])
	{
		int a = 60;/* 60 = 0011 1100*/
		int  b= 13;/* 13 = 0000 1101*/
		int c = 0 ; 
		c = a&b;//12 = 0000 1100
		System.out.println("a & b = " +c);
		c = a|b ; // 61 = 0011 1101
		System.out.println("a | b = " + c);
		c = a^b;// 49 = 0011 0001
		System.out.println("a ^ b = " +c);
		c = ~a; //-61 = 1100 0011
		System.out.println("~a = " +c);
		c = a<<2;//240 = 1111 0000
		System.out.println("a << 2 = " + c);
		c = a>>2;//215 = 1111
		System.out.println("a >> 2 = "+c );
		c = a>>>2;//215 = 0000 1111
		System.out.println("a>>>2 = " +c);
		int gg = -60;
		c = gg>>>2;//215 = 0000 1111
		System.out.println("gg >>> 2 = " +c );
		int x = -1;
		c = x>>>32;
		System.out.println("x >>> 32 = " +c);
		c = x>>>33;
		System.out.println("x >>>33 = " +c);




		int r = 10, q = 5;
		//while(r-->7 || ++q<8);
		while(r-->7 || ++q<8)
		System.out.println(r);
		System.out.println(q);	


	
	}
}
class Test2  
{
	public static void main(String args[])
	{
		class X{}
		class Y extends X {}
		class Z extends Y {}

		X x1 = new Y();
		Y y1 = new Z();
		Y y2 = new Y();
		System.out.println(x1 instanceof X);
		System.out.println(x1 instanceof Z);
		System.out.println(y1 instanceof Z);
		System.out.println(y2 instanceof X);
	}
}
class Test3
{
	public static void main(String args[])
	{
		int i = 10;
		int k = 10;
		int j = 10;
		int a=100, b=200 ,c =300,d=40;
		if(i==10){
			if(j<20) a = b ; 
			if(k>100)c=d;//this if is 
			else a = c ; //associated with this else 
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
			System.out.println("d = "+d);
		}
	}
}
