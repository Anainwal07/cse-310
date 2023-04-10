import java.util.Arrays;
import java.util.*;
//import java.util.Array;
/*public class main{
	public static void main(String []args){
		int a[]; //declaration of array 
		a = new int[10];//allocation of array 
	}
}*/
class Main{
	public static void main(String []args){
		int x[] = new int[10];
		for(int i = 0 ; i<10 ; i++){
			x[i] = (int)(Math.random()*10+1);
			System.out.println(x[i]);
		}
	}
}
/*Take a number bw from 1 to 20 as input from user
Create an array of 10 random numbers bw 1 to 20
check if users no is there or not in array*/
class Main2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[10];
		int count = 0;
		for(int i = 0 ; i<10 ; i++){
			x[i] = (int)(Math.random()*20+1);
			if(x[i] == n){
				count++;
			}
		}
		if(count>0){
			System.out.println("Hurray you won the lottery!");
		}
		else{
			System.out.println("Try your luck next time");
		}
	}
}
/*
class Main3{
	void sort(int arr[],int n){
		for (int i = 0; i < n; i++){  
			for (int j = i + 1; j <n; j++){  
				int tmp = 0;  
				if (arr[i] > arr[j]){  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			} 
		}
		System.out.println("The third highest no is "+arr[2]); 
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>20 && n<3){
			System.out.println("Invalid Input");
		}
		else{
		int x[] = new int[10];
		for(int i = 0 ; i<10 ; i++){
			x[i] = (int)(Math.random()*20+1);
		}
		Main3 obj = new Main3();
		obj.sort(x[],n);
		
		}
	}
}*/

class Main4{
	public static void main(String []args){
	Scanner s = new Scanner(System.in);
	int arr[];
	arr = new int[100];
	System.out.print("Enter the number of elements you want to insert : ");
	int n = s.nextInt();
	for(int i = 0 ; i<n; i++){
		arr[i] = s.nextInt();
	}	
	System.out.print("Enter the element you want to insert: ");
	int x = s.nextInt();
	System.out.print("Enter the index you want to insert the element");
	int j = s.nextInt();
	for(int i = n ; i>j ; i--){
		arr[i] = arr[i-1];
    }
	arr[j] = x ;
	System.out.println("The array after insertion is : " );
	for(int i = 0 ;i<n+1;i++){
		System.out.print(arr[i]+" " );
	}
}
}

class GFG {
	public static void main(String args[])
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
