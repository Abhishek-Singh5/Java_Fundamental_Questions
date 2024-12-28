import java.util.*;
class Main{
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int sum = 0;
        int power = 1;
        
        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit * power;
            power = power * 2;
            n = n /10;
        }
        
        System.out.println(sum);
        
        
    }
}
