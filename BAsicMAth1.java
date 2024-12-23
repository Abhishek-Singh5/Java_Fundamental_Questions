import java.util.Scanner;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter Number :- ");
        int num = s1.nextInt();
        
        // Get the last dijit
        
        int last = num % 10;
        
        System.out.println("Last Digit is :- " + last);
        
        // Remove the last digit from Numbers
        
        int remove = num / 10;
        
        System.out.println("After the Remove Last Digit :- " + remove);
    }
}
