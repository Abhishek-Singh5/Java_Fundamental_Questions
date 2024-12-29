import java.util.*;
class Main{
    public static void main(String [] k){
        
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        int space = 0;
        
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= space; j = j + 1){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            
            space ++;
            
            System.out.println();
        }
    }
}
