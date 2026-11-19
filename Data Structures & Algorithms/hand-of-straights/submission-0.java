class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize != 0) return false;
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(hand);
        for(int card : hand){
            mp.put(card, mp.getOrDefault(card, 0)+1);
        }
        for(int card : hand){
            int k = card;
            for(int j = 0; j < groupSize; j++){
                if(mp.containsKey(k)){
                    mp.put(k, mp.get(k)-1);
                    if(mp.get(k) == 0) mp.remove(k);
                    k++;
                } else if(j == 0) break;
                else return false;
            }
        }
        return true;
    }
}