import java.util.*;
class Main {
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the face value of Dice Between 1 to 6:- ");
        int num = s1.nextInt();
        
        if(num < 1 || num > 6){
            System.out.println("Invalid Number");
        }else{
        
        int dice = 7 - num;
        System.out.println("Opposite face of the Dice is :- \n" + dice);
        }
    
    }
}
