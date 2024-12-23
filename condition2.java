// Find the Year Leap Year Or Not

import java.util.Scanner;

class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int year = s1.nextInt();
        
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                System.out.println(" Leap Year");
            
        }else{
            System.out.println("Not Leap Year");
        }
    }
}