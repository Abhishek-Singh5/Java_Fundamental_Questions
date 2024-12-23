// Even & Odd Number Find

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int num = s1.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Your Number is Even ");
        }else{
            System.out.println("Your Number is Odd ");
        }
    }
}