class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        String substring = "";
        if(m < n) return substring;
        Map<Character, Integer> mps = new HashMap<>();
        Map<Character, Integer> mpt = new HashMap<>();
        for(char c : t.toCharArray()){
            mpt.put(c, mpt.getOrDefault(c, 0)+1);
        }
        int l = 0;
        for(int r = 0; r < m; r++){
            mps.put(s.charAt(r), mps.getOrDefault(s.charAt(r), 0)+1);
            boolean found = true;
            while(r-l+1 >= n && found){
                for(char c : mpt.keySet()){
                    if(!mps.containsKey(c) || mps.get(c) < mpt.get(c)){ 
                        found = false;
                        break;
                    }
                }
                if(found){
                    if(substring.isEmpty() || substring.length() > r-l+1){
                        substring = s.substring(l, r+1);
                    }
                    mps.put(s.charAt(l), mps.get(s.charAt(l))-1);
                    if(mps.get(s.charAt(l)) == 0) mps.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return substring;
    }
}
