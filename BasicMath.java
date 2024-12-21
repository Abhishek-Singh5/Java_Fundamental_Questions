// Find area and Parameter of rectangle.

import java.util.*;
class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        int l = s1.nextInt();
        int b = s1.nextInt();
        
        int area = l * b;
        int Parameter = 2 * (l + b);
        
        System.out.println("Area is :- " + area);
        System.out.println("Parameter is :- " + Parameter);
    }
}