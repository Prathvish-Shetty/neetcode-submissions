class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int maxCnt = 0, cnt = 0;
        for(int num : set){
            cnt = 0;
            if(!set.contains(num-1)){
                int x = num;
                while(set.contains(x)){
                    cnt++;
                    x++;
                }
                maxCnt = Math.max(maxCnt, cnt);
            }
        }
        return maxCnt;
    }
}
