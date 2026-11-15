class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length, maxSum = Integer.MIN_VALUE, pre = 0;
        for(int i = 0; i < n; i++){
            pre += nums[i];
            maxSum = Math.max(maxSum, pre);
            if(pre < 0) pre = 0;
        }
        return maxSum;
    }
}
