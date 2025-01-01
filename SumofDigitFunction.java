import java.util.*;
class Main{
    
    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            sum = sum + num;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        int num1 = s1.nextInt();

        System.out.println("Sum of Digit is :- " + sum(num1));
        
    }
}
