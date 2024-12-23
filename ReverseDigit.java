// Reverse the Integer

import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter Number :- ");
        int num = s1.nextInt();
        
        while( num > 0) {
            
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
 
        }
    }
}
