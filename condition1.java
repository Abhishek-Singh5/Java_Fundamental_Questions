// Find the Year Leap Year Or Not

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int year = s1.nextInt();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Non Leap Year");
                }
                
            }else{
                System.out.println("This Year is Leap Year");
            }
        }else{
            System.out.println(" Non Leap Year ");
        }
    }
}