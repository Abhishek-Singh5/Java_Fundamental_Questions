import java.util.*;
class Main{
    public static void main(String [] k){
        
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the size of Array :- ");
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter the Element of Array :- ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        System.out.print("Printing Array :- ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int i = 0;
        int j = n - 1;
        
        while(i < j){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        
        System.out.print("Reverse Array :- ");
        for(int l = 0; l < n; l++){
            System.out.print(arr[l] + " ");
        }
        System.out.println();
        
    }
}
