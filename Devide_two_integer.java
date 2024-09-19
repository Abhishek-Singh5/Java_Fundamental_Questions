class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean N = dividend < 0 ^ divisor < 0 ;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int q = 0;
        while(dividend - divisor >= 0) {
            int cd = divisor;
            int cq = 1;
            while(dividend -(cd <<1)>=0){
                cd = cd<<1;
                cq = cq<<1;
            }
            q += cq;
            dividend -= cd;
        }
        return N ? - q : q;
    }
}