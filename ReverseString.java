import java.util.*;
class Main{
    
    public static void reverse(String words){
        
        char arr[] = words.toCharArray();
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        
        for(int a = 0; a < arr.length; a++){
            System.out.print(arr[a]);
        }
        
    }
    
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        String s = s1.next();
        
        reverse(s);
        
    }
}
