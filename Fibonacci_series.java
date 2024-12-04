import java.util.*;
class Main {
        static Scanner s1 = new Scanner(System.in);

    static void disp(int Number){
        
        int num1 = 0;
        int num2 = 1;
        
        for(int i = 0; i <= Number; i++){
            
            System.out.print(num1+ " ");
            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        
    }
    
    public static void main(String []k) {
        
        int Number = s1.nextInt();
        disp(Number);
        
    }
}