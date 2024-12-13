import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime");
        }
        
    } 
        public static boolean isPrime(int n){
            
            if(n <= 1){
                return false;
            }
            
            for(int i = 2; i < Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            
            return true;
        }
}