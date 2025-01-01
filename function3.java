import java.util.*;
class Main{
    
    public static boolean checkNumber(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        int num1 = s1.nextInt();

        System.out.println(checkNumber(num1));
        
    }
}
