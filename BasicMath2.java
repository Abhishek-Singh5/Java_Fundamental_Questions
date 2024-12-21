// Enter Temperature in Fahrenheit and convervt to celsius.

//  formula is ------    c = ((f - 32) * 5) / 9


import java.util.*;
class Main{
    public static void main(String[]k){
        Scanner s1 = new Scanner(System.in);
        
        double fahrenheit = s1.nextDouble();
        
        double Celsius = ((fahrenheit - 32) * 5.0) / 9.0;
        
        System.out.println("Temperature in Celsius :-" + Celsius);
        
    }
}