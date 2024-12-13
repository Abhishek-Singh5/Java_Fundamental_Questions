import java.util.*;

class Main{
    public static void main(String []k){
        Scanner s1 = new Scanner(System.in);
        
        String s = s1.nextLine();
        
        char[] ch = s.toCharArray();
        
        for(int i = 0; i< s.length(); i++){
            
            for(int j = i+1; j<s.length(); j++){
                
                
                if(ch[i] == ch[j]){
                    
                    System.out.println("Duplicate Character:-   " + ch[j]);
                    break;
                }
            }
        }
        
    }
}