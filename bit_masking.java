// Bit Array

class Main{
    public static void main(String []k){
        int num = 7;
        
        int bit[] = new int[32];
        
        for(int i = 0; i < 32; i++){
            if((num & (1 << i)) > 0){
                bit[i] = 1;
            }
        }
        
        for(int i = 31; i >= 0; i--){
            System.out.print(bit[i]);
        }
    }
}
