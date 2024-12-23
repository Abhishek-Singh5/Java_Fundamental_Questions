// Check Wheather a character is alphabet or dijit.

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        char a = s1.next().charAt(0);
        
        int value = a;  // Using Asci value
        // A - Z --->  65 - 90
        // a - z --->  97 - 122
        
        if((value >= 65 && value <= 90) || (value >= 97 && value <= 122)){
            System.out.println("This is an Alphabet");
        }else{
            System.out.println("This is Digit");
        }
    }
}