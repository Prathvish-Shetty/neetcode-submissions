class Solution {
    private void f(int i, int[] nums, int target, List<Integer> cur, List<List<Integer>> res){
        if(i == nums.length || target <= 0){
            if(target == 0) res.add(new ArrayList<>(cur));
            return;
        }
        f(i+1, nums, target, cur, res); // skip
        cur.add(nums[i]);
        f(i, nums, target-nums[i], cur, res); // take 
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        f(0, nums, target, new ArrayList<>(), res);
        return res;
    }
}
