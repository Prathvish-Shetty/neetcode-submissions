class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        if(num1.equals("0") || num2.equals("0")) return "0";
        int[] res = new int[m+n]; // numbers of digits of res will always be m+n or m+n-1
        StringBuilder sb = new StringBuilder();
        for(int i = m-1; i >= 0; i--){
            int a = num1.charAt(i)-'0';
            for(int j = n-1; j >= 0; j--){
                int b = num2.charAt(j)-'0';
                int cal = res[i+j+1] + a*b;
                res[i+j+1] = cal%10;
                res[i+j] += cal/10;
            }
        }
        if(res[0] != 0) sb.append(res[0]);
        for(int i = 1; i < m+n; i++){
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
