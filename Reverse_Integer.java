class Solution {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0)  {
            int remainder = x % 10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + remainder;
            x = x/10;

        }
        System.out.println("The reverse no is " + rev);
        return rev;
    }
    public static void main(String [] args) {
        Solution s1 = new Solution();
        s1.reverse(-123);
    }

}