class Calculator {
	void add(int a,int b){
		int x = 20;
		System.out.println(a+b);
	}
}
//Here ScientificCalc is child class and Calculator is parent 
class ScientificCalc extends Calculator{
	int x = 20;
	void add(int a,int b){
		super.add(a,b);
	}
	void add(String a , String b ){
		System.out.println(a+b);
	}
}
class Main{
	public static void main(String []args){
		new ScientificCalc().add(5,2);
		new ScientificCalc().add("Ankit","_nainwal");
		System.out.println(super.x);
	}
}