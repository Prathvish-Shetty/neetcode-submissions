class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i = n-1; i >= 0; i--){
            int d = digits[i]+carry;
            if(d < 10){
                digits[i] = d;
                return digits;
            } else{
                digits[i] = d%10;
                carry = d/10;
            }
        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
}