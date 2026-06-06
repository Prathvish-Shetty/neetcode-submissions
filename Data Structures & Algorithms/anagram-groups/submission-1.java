class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            int[] chrs = new int[26];
            for(char c : str.toCharArray()){
                chrs[c-'a']++;
            }
            String key = Arrays.toString(chrs);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
