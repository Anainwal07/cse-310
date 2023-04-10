class EnumDemo
{
	public enum Season{ SUMMER, WINTER,SPRING}//can keep it outside the class also .
	public static void main(String[]args)
	{	
		for (Season i: Season.values())
			System.out.print(i+" ");
	}	
	
}
enum Laptops {
	MACBOOK,XPS,HP,ASUS,DELL,SURFACE
}
class Main{
	public static void main(String[]args){
		for(Laptops i : Laptops.values())
			System.out.print(i+" ");
		System.out.println();
		Laptops lap = Laptops.ASUS;
		System.out.println(lap.ordinal());
	}
}
enum Laptop {
	MACBOOK(2500),XPS( 2700),HP( 1500),ASUS(1400),MACBOOKPRO(5000,2);;

	int p;
	Laptop(int price){
		p = price ;
	}
	Laptop (int price , int mul){
		p = price*mul;
	}
	int displayPrice(){
		return p;
	}
}

class Main2{
	public static void main(String[]args){
		for(Laptop i : Laptop.values())
			System.out.println(i+" : "+i.displayPrice());
			
	}
}

class Demo{
	Demo(){
		System.out.println("Default");
	}
	Demo(int a){
		System.out.println("Parameterized With 1 ");
	}
	Demo(int a , int b){
		System.out.println("2 Parameters");
	}
}
class Main4{

	public static void main(String []args){
		Demo d = new Demo(2,3);
 	}
}