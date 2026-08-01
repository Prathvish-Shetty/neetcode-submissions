class Solution {
    private boolean isPossible(int[] piles, int speed, int maxHrs){
        int hrs = 0;
        for(int pile : piles){
            hrs += (pile)/speed;
            if(pile%speed != 0) hrs++;
        }
        return hrs <= maxHrs;
    }
    public int minEatingSpeed(int[] piles, int hrs) {
        int l = 1, h = 0;
        for(int pile : piles){
            h = Math.max(h, pile);
        }
        int minSpeed = 0;
        while(l <= h){
            int m = l+(h-l)/2;
            if(isPossible(piles, m, hrs)){
                minSpeed = m;
                h = m-1;
            } else {
                l = m+1;
            }
        }
        return minSpeed;
    }
}
