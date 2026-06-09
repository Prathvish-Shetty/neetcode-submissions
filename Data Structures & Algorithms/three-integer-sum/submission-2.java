class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = 0, m = l+1, r = nums.length-1, n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        while(l < r){
            while(l > 0 && l < r && nums[l-1] == nums[l]) l++;
            m = l+1;
            while(m < r){
                int sum = nums[l]+nums[m]+nums[r];
                if(sum == 0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[l], nums[m], nums[r])));
                    m++;
                    r--;
                    while(m < r && nums[m-1] == nums[m]) m++;
                    while(m < r && r < n-1 && nums[r] == nums[r+1]) r--;
                }
                else if(sum > 0) r--;
                else m++;
            }
            r = n-1;
            l++;
        }
        return ans;
    }
}
