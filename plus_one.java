class Solution {
    public int[] plusOne(int[] a) {
        for(int i = a.length - 1; i >=0; i--){
            if(a[i] < 9){
                a[i]++;
                return a;
            }
        a[i] = 0;
    }
    int x[] = new int[a.length + 1];
        x[0] = 1;
        return x;
}
}