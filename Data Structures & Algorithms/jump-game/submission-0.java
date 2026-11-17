class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, maxIdx = 0; // max index we can reach
        for(int i = 0; i < n; i++){
            if(maxIdx < i) return false;
            maxIdx = Math.max(maxIdx, i+nums[i]);
            if(maxIdx >= n-1) return true;
        }
        return true;
    }
}
