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
        
        boolean isAssending = true;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]) {
                isAssending = false;
                break;
            }
        }
        
        if(isAssending){
            System.out.print("Yes This Array is in Assending Order ");
        }else{
            System.out.print("Nope");
        }
        
    }
}
