class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n < 3) return 0;
        int l = 1, r = n-2, pre = height[0], suc = height[n-1], totalArea = 0;
        while(l <= r){
            if(height[l] >= pre){
                pre = height[l];
                l++;
            } else if(height[r] >= suc){
                suc = height[r];
                r--;
            } else if(pre < suc){
                int larea = Math.min(pre, suc)-height[l];
                totalArea += larea;
                l++;
            } else{
                int rarea = Math.min(pre, suc)-height[r];
                totalArea += rarea;
                r--;
            }
        }
        return totalArea;
    }
}
