class Solution {
    private boolean check(String s, int i, int cnt, Boolean[][] dp){
        if(cnt < 0) return false;
        if(i == s.length()) return cnt == 0;
        if(dp[i][cnt] != null) return dp[i][cnt]; 
        if(s.charAt(i) == '(') dp[i][cnt] = check(s, i+1, cnt+1, dp);
        else if(s.charAt(i) == ')') dp[i][cnt] = check(s, i+1, cnt-1, dp);
        else dp[i][cnt] = check(s, i+1, cnt, dp) || check(s, i+1, cnt+1, dp) || check(s, i+1, cnt-1, dp);
        return dp[i][cnt];
    }
    public boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()][s.length()];
        return check(s, 0, 0, dp);
    }
}
