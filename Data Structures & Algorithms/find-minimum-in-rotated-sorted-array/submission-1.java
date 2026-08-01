class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1;
        while(l <= h){
            int m = l+(h-l)/2;
            if((m == 0 || nums[m] < nums[m-1]) && (m == nums.length-1 || nums[m] < nums[m+1])){
                return nums[m];
            } else if(nums[m] <= nums[h]){
                h = m-1;
            } else {
                l = m+1;
            }
        }
        return nums[l];
    }
}
