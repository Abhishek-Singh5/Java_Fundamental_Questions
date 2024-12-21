// Calculate total average and percentage of five subjects.


import java.util.*;
class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int English = s1.nextInt();
        int Maths = s1.nextInt();
        int java = s1.nextInt();
        int python = s1.nextInt();
        int ML = s1.nextInt();
        
        int total = English+Maths+java+python+ML;
        
        double Average = total / 5;
        int percentage = total / 5;
        
        System.out.println("Total is :- " + total);
        System.out.println("Average is :- " + Average);
        System.out.println("Percentage is :- " + percentage);
        
        
    }
}