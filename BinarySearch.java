import java.util.*;
class Main{
    
    public static int binarySearch(int arr[], int target){
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the size of Array ");
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        System.out.println("Enter the Target of Array ");
        int target = s1.nextInt();
        
        int result = binarySearch(arr, target);
        
        System.out.println(result);
    }
}