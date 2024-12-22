// Max Number 

import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int a = s1.nextInt();
        int b = s1.nextInt();
        
        if(a > b){
            System.out.println("Bigger Number is :- " + a);
        }
        else if(b > a) {
            System.out.println("Bigger Number is :- " + b);
        }
        else if(a == b){
            System.out.println("Both number is Equal");
        }
        else{
            System.out.println("Enter Valid Number");
        }
    }
}