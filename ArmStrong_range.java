import java.util.*;
class Main{
    public static boolean isArmstrong(int num){
            
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
        
        return sum == num;
    }
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        int start = s1.nextInt();
        int end = s1.nextInt();
    
    for(int i = start; i <= end; i = i +1){
        if(isArmstrong(i)){
            System.out.print(i + " ");
            }
        }
    }
}
