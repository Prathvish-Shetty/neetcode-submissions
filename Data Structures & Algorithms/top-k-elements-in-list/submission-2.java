class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        int n = nums.length, i = 0;
        List<Integer>[] freq = new List[n+1];
        for(int j = 0; j <= n; j++){
            freq[j] = new ArrayList<>();
        }
        int[] elements = new int[k];
        for(int key : mp.keySet()){
            freq[mp.get(key)].add(key);   
        }
        for(int j = n; j >= 0 && i < k; j--){
            for(int e : freq[j]){
                elements[i++] = e;
            }
        }
        return elements;
    }
}
