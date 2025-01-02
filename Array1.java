import java.util.*;

class Main{
    public static void main(String [] k){
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Size of Array :- ");
        int size = s1.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the Element of Array :- ");

        for(int i = 0; i < 5; i++){
            arr[i] = s1.nextInt();
            
        }
        
        System.out.println("Printing of Array :- ");
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
        
    }
}
