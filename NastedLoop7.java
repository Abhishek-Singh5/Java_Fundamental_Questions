import java.util.*;
class Main{
    public static void main(String [] k){
        
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= i; j = j + 1){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
