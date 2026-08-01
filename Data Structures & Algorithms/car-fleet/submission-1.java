class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);
        Deque<Double> st = new ArrayDeque<>(); 
        for(int[] car : cars){
            double time = (target-car[0])/(double)car[1];
            while(!st.isEmpty() && st.peek() <= time) st.pop();
            st.push(time);
        }
        return st.size();
    }
}