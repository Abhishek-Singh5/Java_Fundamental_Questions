import java.util.*;
class Main{
    public static void main(String [] k){
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array :- ");
        int n = s1.nextInt();
        int arr[] = new int [n];
        
        System.out.println("Enter the Element of Array :- ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        System.out.println("Enter the Size of Array :- ");
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter the target Value :- ");
        int target = s1.nextInt();
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == target){
                System.out.println("Your Indexing is :- " + i);
                break;
            }else{
                System.out.println("Not Found ");
            }
            
        }
    }
}
