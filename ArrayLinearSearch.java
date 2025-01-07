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
        System.out.println("Enter the Target Value of Array ");
        int answer = -1;
        int target = s1.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                answer = i;
                break;
            }
        }
            if(answer == -1){
                System.out.println("Target not Exists ");
            }else{
                System.out.println("Target on " + answer + " Index ");
            }
    }
}
