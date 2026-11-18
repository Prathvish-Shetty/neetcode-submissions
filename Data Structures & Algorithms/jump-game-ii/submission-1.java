class Solution {
    public int jump(int[] nums) {
        int n = nums.length, jumps = 0, maxIdx = 0;
        int[] minJumps = new int[n];
        Arrays.fill(minJumps, n);
        minJumps[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= i+nums[i] && j < n; j++){
                minJumps[j] = Math.min(minJumps[j], minJumps[i]+1);
                if(j == n-1) return minJumps[j];
            }
        }
        return minJumps[n-1];
    }
}
