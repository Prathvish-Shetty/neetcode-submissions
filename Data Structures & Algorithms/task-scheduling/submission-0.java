class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCnt = new int[26];
        int mx = 0, freq = 0;
        for(char task : tasks){
            int idx = task-'A';
            taskCnt[idx]++;
            if(taskCnt[idx] > mx) mx = taskCnt[idx];
        }
        for(int c : taskCnt){
            if(c == mx) freq++;
        }
        return Math.max(tasks.length, (mx-1)*(n+1)+freq);
    }
}
