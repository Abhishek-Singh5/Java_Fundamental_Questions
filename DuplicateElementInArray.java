import java.util.*;
class Main{
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the size of Array ");
        int n = s1.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Input Array " + n + " Elements  ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        System.out.println("Printing the Array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int maxNumber = 0;
        for(int i = 0; i < n; i++){
            maxNumber = Math.max(maxNumber, arr[i]);
        }
        int frequency[] = new int[maxNumber + 1];
        for(int i = 0; i < n; i ++){
            frequency[arr[i]]++;
        }
        
        int count = 0;
        for(int i = 0; i < maxNumber + 1; i++){
            if(frequency[i] >= 2){
                count++;
            }
        }
        System.out.println("Duplicate Element in Array ");
        System.out.println(count);
    }
}
