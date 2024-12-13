import java.util.*;

class Main{
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int num = n;
        
        int result = 0;
        
        while(n != 0){
            
            int remainder = n % 10;
            result = result * 10 + remainder;
            n = n / 10;
        }
        
        if(result == num){
            System.out.println("This is pelindrome Number");
        }else{
            System.out.println("Invalid Number");
        }
    }
}