class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), l = 0, maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>(); // char, latest idx
        for(int r = 0; r < n; r++){
            char c = s.charAt(r);
            if(mp.containsKey(c)){
                l = Math.max(mp.get(c)+1, l);
            }
            maxLen = Math.max(maxLen, r - l + 1);
            mp.put(c, r);
        }
        return maxLen;
    }
}
