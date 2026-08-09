class KthLargest {
    List<Integer> al;
    int k;
    public KthLargest(int k, int[] nums) {
        al = new ArrayList<>();
        this.k = k;
        for(int num : nums) al.add(num);
        Collections.sort(al);
    }
    
    public int add(int val) {
        al.add(val);
        int i = al.size()-1;
        while(i > 0 && al.get(i-1) > al.get(i)){
            int t = al.get(i);
            al.set(i, al.get(i-1));
            al.set(i-1, t);
            i--;
        }
        return al.get(al.size()-k);
    }   
}
