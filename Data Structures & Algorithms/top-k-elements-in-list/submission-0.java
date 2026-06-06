class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        for(int key : mp.keySet()){
            pq.offer(new int[]{key, mp.get(key)});
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] elements = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            elements[i++] = pq.poll()[0];
        }
        return elements;
    }
}
