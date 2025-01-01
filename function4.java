import java.util.*;
class Main{
    
    public static int maxNumber(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    
    public static int minNumber(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        int x = s1.nextInt();
        int y = s1.nextInt();
        

        System.out.println("Maximum Number :- " + maxNumber(x, y));
        System.out.println("Minimum Number :- " + minNumber(x, y));
        
    }
}
