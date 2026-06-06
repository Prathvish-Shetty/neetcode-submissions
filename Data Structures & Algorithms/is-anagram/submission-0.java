class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mp = new int[26];
        for(char c : s.toCharArray()){
            mp[c-'a']++;
        }
        for(char c : t.toCharArray()){
            mp[c-'a']--;
        }
        for(int f : mp){
            if(f != 0) return false;
        }
        return true;
    }
}
