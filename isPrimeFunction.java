import java.util.*;
class Main{
    
    public static boolean isPrime(int n){
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        
        if(count == 2)
            return true;
        else
            return false;
    }
    
    public static void prime(int start, int end){
        for(int i = start; i <= end; i++){
            
            if(isPrime(i) == true){
                System.out.print(i + " ");
            }
            
        }
    }
        

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        int x = s1.nextInt();
        int y = s1.nextInt();
        
        Main m1 = new Main();
        m1.prime(x, y);
       
    }
}
