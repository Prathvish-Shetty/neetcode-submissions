class Solution {
    private void f(int[] nums, int i, List<Integer> al, List<List<Integer>> res){
        if(i == nums.length){
            res.add(new ArrayList<>(al));
            return;
        }
        f(nums, i+1, al, res);
        al.add(nums[i]);
        f(nums, i+1, al, res);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(nums, 0, new ArrayList<>(), res);
        return res;
    }
}
/*
Time:  O(n * 2^n)
Space: O(n) recursion + O(n) current list
       + O(n * 2^n) for the result
*/
