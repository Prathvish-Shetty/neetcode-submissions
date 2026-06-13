class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), l = 0, maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int r = 0; r < n; r++){
            while(mp.containsKey(s.charAt(r))){
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l)) == 0) mp.remove(s.charAt(l));
                l++;
            }
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0)+1);
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
