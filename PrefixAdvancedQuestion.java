import java.util.*;
class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        int diff[] = new int[n+1];
        
        int q = s1.nextInt();
        
        for(int i = 0; i < q; i++){
            int l = s1.nextInt();
            int r = s1.nextInt();
            int val = s1.nextInt();
            
            diff[l] = diff[l] + val;
            diff[r+1] = diff[r+1] - val;
            
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += diff[i];
            
            System.out.println(sum + arr[i]);
        }
    }
}


