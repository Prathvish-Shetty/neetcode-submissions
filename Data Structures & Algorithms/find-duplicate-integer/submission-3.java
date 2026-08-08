class Solution {
    public int findDuplicate(int[] nums) {
        while(true){
            if(nums[0] == nums[nums[0]])    return nums[0];
            int t = nums[0];
            nums[0] = nums[t];
            nums[t] = t;
        }
    }
}