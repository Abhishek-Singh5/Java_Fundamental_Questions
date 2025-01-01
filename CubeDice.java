import java.util.*;
class Main {
    public static void main(String [] k){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the face value of Dice :- ");
        int num = s1.nextInt();
        
        int dice = 7 - num;
        System.out.println("Opposite face of the Dice is :- \n" + dice);
    
    }
}
