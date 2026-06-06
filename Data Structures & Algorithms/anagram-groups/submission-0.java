class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String sorted = String.valueOf(chrs);
            if(!mp.containsKey(sorted)){
                mp.put(sorted, new ArrayList<>());
            }
            mp.get(sorted).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
