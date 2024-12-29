import java.util.*;

class Main {
    public static void main(String[] k) {
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        int leftSpace = n-1;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= leftSpace; j++){
                System.out.print(" ");
            }
            
            if(i == 1 || i == n){
                for(int j = 1; j<=n; j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                
                for(int j = 1; j<=n-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            leftSpace = leftSpace -1;
            
            System.out.println();
        }
    }
}
