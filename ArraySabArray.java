import java.util.*;
class Main{
    public static void main(String [] s){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the Element of Array ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        System.out.println("Printing Array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Printing the SubArray ");
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] +" ");
                }
            
                System.out.println();
            }
            
        }
        
    }
}
