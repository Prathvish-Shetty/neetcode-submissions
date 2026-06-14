class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[] f1 = new int[26];
        for(char c : s1.toCharArray()){
            f1[c-'a']++;
        }
        int[] f2 = new int[26];
        int l = 0;
        for(int r = 0; r < n; r++){
            f2[s2.charAt(r)-'a']++;
            if(r-l+1 == m){
                boolean found = true;
                for(int i = 0; i < 26; i++){
                    if(f1[i] != f2[i]){
                        found = false;
                        break;
                    }
                }
                if(found) return true;
                f2[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
    }
}
