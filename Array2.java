import java.util.*;
class Main{
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = s1.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the Element of Array ");
        for(int i = 0; i < n; i++){
            arr[i] = s1.nextInt();
        }
        System.out.println("Printing Array ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the Value of Array ");
        int value =  s1.nextInt();
        System.out.println("Enter the Position of Array ");
        int position = s1.nextInt();
        
        int answer[] = new int[n + 1];
        
        int i = 0;
        int j = 0;
        
        while(i < n + 1){
            if(i == position - 1){
                answer[i] = value;
            }else{
                answer[i] = arr[j];
                j++;
            }
            i++;
        }
        
        
        System.out.println("Updated Array ");
        i = 0;
        while(i < n + 1){
            System.out.print(answer[i] + " ");
            i++;
        }
        
    }
}
