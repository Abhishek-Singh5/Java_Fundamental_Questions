import java.util.*;
class Main {
    
    static boolean checkAp(int arr[] , int n){
        
        if(n == 1) {
            return true;
        }
        
        Arrays.sort(arr);
        
        int diff = arr[1] - arr[0];
        
        for(int i = 2; i < n; i++){
            if(arr[i] - arr[i - 1] != diff){
                return false;
            }
            
            
        }
        return true;
    }
    
    public static void main(String [] k){

        int arr[] = {20, 15, 5, 0, 10};
 
        int n = arr.length;
        
        if(checkAp(arr, n)){
            System.out.println("This is Arithmetic progression");
        }else{
            System.out.println("Not");
        }
        
    }
}
