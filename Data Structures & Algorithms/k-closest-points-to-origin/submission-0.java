class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2]-b[2]);
        for(int[] point : points) pq.offer(new int[]{point[0], point[1], point[0]*point[0] + point[1]*point[1]});
        for(int i = 0; i < k; i++){
            ans[i] = new int[]{pq.peek()[0], pq.peek()[1]};
            pq.poll();
        }
        return ans;
    }
}
