import java.util.*;
class Main{
    
    public static void update(int a){
        a = a + 1;
        System.out.println("Local function :- " + a);
    }
    
    public static void updateArray(int arr[]){
        arr[0] = 10;
        arr[1] = 20;
        System.out.print("Local function Array :- ");
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    

    
    public static void main(String [] k){
        // Pass by Value 
        int b = 5;
        update(b);
        System.out.println("Main function :- " + b);
        
        // Paas by Reference
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2; 
        
        updateArray(arr);
        
        System.out.print("Main function :- ");
        for(int i = 0; i < 5; i++){
        System.out.print(+ arr[i] + " ");
        }
    }
}
