import java.io.*;
import java.util.*;

 class Solution {
    int countA = 0;
    int countP =0;
     void Adhar(){
        countA++;
        System.out.println("A10"+countA);
        
    }
    void PAN() {
        countP++;
        System.out.println("P10"+countP);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Solution S = new Solution();
        int n = s.nextInt();
        s.nextLine();
        for(int i = 0 ; i<n ; i++){
            String name = s.nextLine();
            char c = s.next().charAt(0);
            if(c == 'A'){
                long A = s.nextLong();
                S.Adhar();
            }
            else if(c == 'P'){
                String P = s.nextLine();
                S.PAN();
            }
        }
    }
}