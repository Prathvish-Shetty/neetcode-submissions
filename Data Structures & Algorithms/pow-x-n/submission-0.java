class Solution {
    private double pow(double x, long n){
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n%2 == 0) return pow(x*x, n/2);
        return x*(pow(x*x, n/2));
    }
    public double myPow(double x, int n) {
        return n < 0 ? 1/pow(x, -n) : pow(x, n);
    }
}