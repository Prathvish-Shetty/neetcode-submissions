class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), l = 0, maxLen = 0;
        int[] charIndex = new int[128]; // char, latest idx
        for(int r = 0; r < n; r++){
            char c = s.charAt(r);
            if (charIndex[c] > 0) {
                l = Math.max(charIndex[c], l);
            }
            maxLen = Math.max(maxLen, r - l + 1);
            charIndex[c] = r + 1;
        }
        return maxLen;
    }
}
