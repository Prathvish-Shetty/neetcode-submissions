class Node{
    Node[] node = new Node[26];
    boolean isEnd;  
}
class PrefixTree {
    Node node;
    public PrefixTree() {
        node = new Node();
    }

    public void insert(String word) {
        Node nn = node;
        for(char c : word.toCharArray()){
            if(nn.node[c-'a'] == null){
                nn.node[c-'a'] = new Node();
            }
            nn = nn.node[c-'a'];
        }
        nn.isEnd = true;
    }

    public boolean search(String word) {
        Node nn = node;
        for(char c : word.toCharArray()){
            if(nn.node[c-'a'] == null) return false;
            nn = nn.node[c-'a'];
        }
        return nn.isEnd;
    }

    public boolean startsWith(String prefix) {
        Node nn = node;
        for(char c : prefix.toCharArray()){
            if(nn.node[c-'a'] == null) return false;
            nn = nn.node[c-'a'];
        }
        return true;
    }
}
