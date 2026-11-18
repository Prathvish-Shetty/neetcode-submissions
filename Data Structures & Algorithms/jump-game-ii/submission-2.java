class Solution {
    public int jump(int[] nums) {
        int n = nums.length, l = 0, r = 0, farthest = 0, jumps = 0;
        while(r < n-1){
            for(int i = l; i <= r; i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}
