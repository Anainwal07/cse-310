class While
{
	public static void main(String args[])
	{
		int n = 10;
		char a = 'G';
		while(n>0)
		{
			System.out.print(a);
			n--;
			a++;
		}
	}
}
class Loop
{
	public static void main(String args[])
	{
		int i ;
		for(i = 0 ; i<5 ; i ++);
			System.out.println(i++); //5 because 
	
	}
}
class var2
{
	public static void main(String arr[])
	{
		int a , b;
		b = 5;
		for(a = 0 ; a<b;a++){
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			b--;
		}
	}
}
class var21
{
	public static void main(String arr[])
	{
		int x , y;
		for(x = 0 , y=5;x<=y; x++ ,y++){
			System.out.println("x = "+x);
			System.out.println("x = "+y);
		}
	}
}
class Loopchk
{
	public static void main(String arr[])
	{
	for(int i = 1 , j = 5 ; i>0 && j>2 ;i++,j--)
		System.out.println("i is : " +i+ " and j is : "+j);
	}
}
class ForEach
{
	public static void main(String arr[])
	{
		int num[] = { 1,2,3,4,5};
		int sum = 0 ; 
 		for(int i : num){
			System.out.println("Value is : " +i);
			sum += i;
		}
		System.out.println("Sum is : " +sum);
	}
}	
class ForEachMArray
{
	public static void main(String args[])
	{
		int sum = 0 ;
		int num[][] = new int[3][5];
		//give num some values 
		for(int i = 0 ; i<3; i++)
			for(int j = 0 ; j<5;j++)
				num[i][j] = (i+1)*(j+1);
		//use for-each for to display and sum the values
			for(int x[]:num){
				for(int y :x ){
					System.out.println("Value is " +y);
					sum+=y;
				}
			}
		System.out.println("Summation : " +sum);
	}
}
class NestedLoop
{
	public static void main(String arr[])
	{
		int i , j;
		for(i = 0 ; i<10 ; i++){
			for(j = i ; j<10 ; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
class Break
{
	public static void main(String args[])
	{
		for(int i= 0; i<100;i++){
			if(i == 10)break;
			System.out.println("i : " +i);
		}
		System.out.println("Loop completed ");
	}
}
class BreakDemo
{
	public static void main(String []rk)
	{
		outer:
			for(int i = 0; i<3 ; i++){
				System.out.println("Outer " +i);
				inner:
					for(int j = 0 ; j<3 ;i++){
						System.out.println("Inner "+j);
						if(i == j+1)
							break outer;
						System.out.println("Bye");
					}
			}
	}

}

class ContinueDemo
{
	public static void main(String []rk)
	{
		String str = "She saw a ship in the sea ";
		int size = str.length();
		int count = 0 ;
		for(int i = 0 ; i<size ;i++){
			if(str.charAt(i)!= 's')
				continue;
			count++;
		}
		System.out.println("Number of s in "+ str + " = " + count);
	}
}
class ContinueLabel
{
	public static void main(String []rk)
	{
		outer: for(int i = 0 ; i<3 ;i++){
				for(int j = 0; j<3 ;j++){
					if(j>i){
						System.out.println("Hi");
						continue outer;
					}
					System.out.print(" " + (i*j));
				}
			}
		System.out.println("Done");
	}
}
class WHY
{
	public static void main(String args[])
	{
		outer:
			for(int i = 0; i<3 ; i++){
				inner :
					for(int j = 0;j<3;j++){
						System.out.println(i+","+j);
						if(j==2)break inner;
						if(i ==j)continue outer;
						System.out.println("Bye");
					}
			}
	}
}

class BreakTest
{
	public static void main(String []rk)
	{
		int n=5;
		outer: for(int a=1; a<5 ;a++){
				int i =0,j=0;
				System.out.println();
				space: while(true){
						System.out.print(" ");
						if(i==n-a)
							break space ;
					}
				star: while(true){
						System.out.print(" * ");
						j++;
						if(j==a)continue outer;
					}
			}
	}
}