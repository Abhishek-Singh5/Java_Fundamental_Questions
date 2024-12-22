// Using Switch Case 

import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter Day Number :- ");
        int button = s1.nextInt();
        
        switch(button){
            case 1 :
                System.out.println("Monday");
                break;
                
            case 2 :
                System.out.println("Tuesday");
                break;
                
            case 3 :
                System.out.println("Wednesday");
                break;
                
            case 4 :
                System.out.println("Thursday");
                break;
                
            case 5 :
                System.out.println("Friday");
                break;
                
            case 6 :
                System.out.println("Saturday");
                break;
                
            case 7 :
                System.out.println("Sunday");
                break;
                
            default :
                System.out.println("Enter Valid Day");
        }
    }
}