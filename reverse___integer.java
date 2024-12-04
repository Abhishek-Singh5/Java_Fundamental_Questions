import java.util.*;
class Main {
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int number = s1.nextInt();
        int reverse = 0;
        
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        
        System.out.println("Reverse number is :- " + reverse);
    }
}