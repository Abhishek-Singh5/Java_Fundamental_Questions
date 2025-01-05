import java.util.Scanner;
class Main{
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the size of Array ");
        int n = s1.nextInt();
        int arr[] = new int [n];
        
        System.out.println("Enter the Element of Array ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        
        System.out.println("Printing Array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is :- " + max);
        
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element is :- " + min);
    }
}
