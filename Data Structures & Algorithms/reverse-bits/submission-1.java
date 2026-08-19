class Solution {
    public int reverseBits(int n) {
        int m = 0;
        for(int x = 0; x <= 31; x++){
            m <<= 1;
            m = m | ((n&(1<<x)) != 0 ? 1 : 0);
        }
        return m;
    }
}
