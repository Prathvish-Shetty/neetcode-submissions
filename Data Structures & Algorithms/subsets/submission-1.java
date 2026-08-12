class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int pow = 1 << n;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < pow; i++){
            List<Integer> al = new ArrayList<>();
            int x = i, y = n-1;
            while(x > 0){
                if((x&1) == 1) al.add(nums[y]);
                y--;
                x >>= 1;
            }
            res.add(al);
        }
        return res;
    }
}
