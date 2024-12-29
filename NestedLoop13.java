import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        //lower part
        
        for(int i = n-1; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
