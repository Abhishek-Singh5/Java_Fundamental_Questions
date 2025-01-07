import java.util.*;
class Main{
    public static void main(String [] q){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the size of Array ");
        int n = s1.nextInt();
        System.out.println("Enter How many times to Rotate Array ");
        int k = s1.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Input Array " + n + " Elements  ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        int reversed[] = new int[n];
        
        k = k % n;
        
        for(int i = 0; i < n; i++){
            int newIndex = (i - k);
            
            if(newIndex < 0){
                newIndex = newIndex + n;
            }
            reversed[newIndex] = arr[i];
        }
        
        System.out.println("After the Rotate Array ");
        for(int i = 0; i < n; i++){
            System.out.print(reversed[i] + " ");
        }
    }
}
