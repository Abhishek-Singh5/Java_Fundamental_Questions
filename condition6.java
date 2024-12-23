// Print Multiplication table is given

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int num = s1.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " " + "*" + " "+i + " " + "=" + " " + num*i);
        }
    }
}