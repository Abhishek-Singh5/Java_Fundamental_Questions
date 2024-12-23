// Print all Odd numbers From 1 to n

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int num = s1.nextInt();
        
        for(int i = 1; i <= num; i = i+2){
                System.out.print( i + " " );
            
        }
    }
}