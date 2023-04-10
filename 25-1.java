import java.util.*;
class XYZ 
{
	int x = 10;
	public static void main(String arg[])
	{
			
		//System.out.println(x);//error : because non static variable 
						//cannot be accessed 
	}
}
/*class Xyz 
{
	int x =10;
	void display(){
		System.out.println(x);
	}
	public static void main(String a []){
		xyz obj = new xyz();
		obj.display();//10
		obj.x = 25;
		obj.display();//x = 25
	}
}*/
/* Create a class named Banking Application . you need to include
3 methods namely deposit() , withdraw(),check_bal().The first
two methods will update the balance after deposit or withdraw 
is called . */

class Bankapp{
	int deposit(int amt , int bal){
		bal+=amt;
		System.out.println("Your balance after deposit is "+bal);
		return bal;
	}
	int withdraw(int subt, int bal){
		bal -=subt;
		System.out.println("Your balance after withdrawal is "+bal);
		return bal;
	}
	void check_bal(){
	
	}
 	public static void main(String args[]){
		int bal = 0;
		Scanner s = new Scanner(System.in);
		int ch = -1;
		Bankapp obj = new Bankapp();
		while(ch !=0){
			System.out.println("Press 1 to deposit : ");
			System.out.println("Press 2 to withdraw : ");
			System.out.println("Press 3 to check balance : ");
			System.out.println("Press 0 to discontinue : ");
			ch = s.nextInt();
			if(ch == 1){
				System.out.println("Enter the amount you want to deposti : ");
				int add = s.nextInt();
				bal = obj.deposit(add,bal);
			}
			if(ch == 2 ){
				System.out.println("ENter the amount you want to withdraw ");
				int subt = s.nextInt();
				bal = obj.withdraw(subt,bal);
			}
			if(ch == 3 ){
				obj.checkbal(bal);
			}
			if (ch ==0 ){
			 	System.out.println("You are out of the program");
			}
	}
}}