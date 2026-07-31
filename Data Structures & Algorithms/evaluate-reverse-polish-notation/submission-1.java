class Solution {
    public int evalRPN(String[] tokens) {
        int[] st = new int[tokens.length];
        int top = 0;
        for(String token : tokens){
            switch(token){
                case "+": 
                    st[top-2] = st[top-2]+st[top-1];
                    top--;
                    break;
                case "-": 
                    st[top-2] = st[top-2]-st[top-1];
                    top--;
                    break;
                case "*": 
                    st[top-2] = st[top-2]*st[top-1];
                    top--;
                    break;
                case "/": 
                    st[top-2] = st[top-2]/st[top-1];
                    top--;
                    break;
                default: 
                    st[top++] = Integer.parseInt(token);
                    break;
            }
        }
        return st[0];
    }
}