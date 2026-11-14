class Solution {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    while (n != 1 && !set.contains(n)) {
      set.add(n);
      int m = 0;
      while (n > 0) {
        m += (n % 10) * (n % 10);
        n /= 10;
      }
      n = m;
    }
    return n == 1;
  }
}