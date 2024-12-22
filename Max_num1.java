// Max Number 

import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();
        
        if(a > b && a > c){
            System.out.println("Bigger Number is :- " + a);
        }
        else if(b > a && b > c) {
            System.out.println("Bigger Number is :- " + b);
        }
         else if(c > a && c > b) {
            System.out.println("Bigger Number is :- " + c);
        }
        else if(a == b && b == c){
            System.out.println("All number is Equal");
        }
        else{
            System.out.println("Enter Valid Number");
        }
    }
}