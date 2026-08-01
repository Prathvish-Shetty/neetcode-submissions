class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] res = new double[n][3];
        for(int i = 0; i < n; i++){
            res[i][0] = position[i];
            res[i][1] = speed[i];
            res[i][2] = (target-position[i])/(double)speed[i];
        }
        Arrays.sort(res, (a, b) -> Double.compare(a[0], b[0]));
        Stack<Double> st = new Stack<>(); 
        for(double[] i : res){
            while(!st.isEmpty() && st.peek() <= i[2]) st.pop();
            st.push(i[2]);
        }
        return st.size();
    }
}