class Solution {
    public boolean isHappy(int n){
        return isHappyNumber(n, new HashSet<>());
    }
    public boolean isHappyNumber(int n, Set<Integer> set) {
        if(n == 1) return true;
        if(set.contains(n)) return false;
        set.add(n);
        int m = 0;
        while(n > 0){
            m += (n%10)*(n%10);
            n /= 10;
        }
        return isHappyNumber(m, set);
    }
}