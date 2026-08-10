class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) maxHeap.offer(stone);
        while(maxHeap.size() > 1){
            int a = maxHeap.poll(), b = maxHeap.poll();
            if(a != b) maxHeap.offer(Math.abs(a-b));
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
