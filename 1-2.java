//Arrays 
import java.util.*;
class array{
	public static void main(String args[]){
		int a[] = new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5;i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i<5 ; i++){
			System.out.print((a[i]+2)+" ");
	
		}
		System.out.println();
		int marks[] = {12,34,45,46,78};
		for(int b : marks ){
			b+=2;
			System.out.println(b);
		}
	}
}

//Q. Generate the array of random no and the range 
//should be  bw 15 to 20

