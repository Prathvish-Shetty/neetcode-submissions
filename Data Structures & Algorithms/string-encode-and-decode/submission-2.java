class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return new ArrayList<>();
        int n = str.length(), i = 0;
        List<String> strs = new ArrayList<>();
        while(i < n){
            int len = 0;
            while(str.charAt(i) != '#'){
                len = len*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            strs.add(str.substring(i, i+len));
            i += len;
        }
        return strs;
    }
}
