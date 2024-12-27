import java.util.*;
class Main{
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        int num = s1.nextInt();
        
        int original = num;
        int count = 0;
        
        while(original > 0){
            original = original / 10;
            count = count + 1;
        }
        
        original = num;
        int sum = 0;
        while(original != 0){
            int digit = original % 10;
            sum = sum + (int)Math.pow(digit, count);
            original = original / 10;
        }
        
        
        if(sum == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
