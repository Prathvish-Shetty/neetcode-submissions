class Solution {
    public int jump(int[] nums) {
        int n = nums.length, l = 0, r = 0, farthest = 0, jumps = 0;
        while(r < n-1){
            while(l <= r){
                farthest = Math.max(farthest, l+nums[l]);
                l++;
            }
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}
