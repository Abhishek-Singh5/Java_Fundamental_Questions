import java.util.Scanner;
class Main{
    public static void main(String []k){
        
        Scanner s1 = new Scanner(System.in);
        
        int num = s1.nextInt();
        
        for(int i = 0; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        
    }
}
