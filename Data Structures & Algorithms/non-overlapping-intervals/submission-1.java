class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = intervals[0][1], cnt = 1;
        for(int i = 1; i < intervals.length; i++){
            if(prev <= intervals[i][0]){
                cnt++;
                prev = intervals[i][1];
            } 
        }
        return intervals.length-cnt;
    }
}