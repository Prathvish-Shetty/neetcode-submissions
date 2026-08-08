/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> mp = new HashMap<>();
        Node t = head;
        while(t != null){
            Node nn = new Node(t.val);
            mp.put(t, nn);
            t = t.next;
        }
        Node dummy = new Node(-1);
        Node t1 = dummy;
        t = head;
        while(t != null){
            t1.next = mp.get(t);
            t1 = t1.next;
            t1.next = mp.get(t.next);
            t1.random = mp.get(t.random);
            t = t.next;
        }
        return dummy.next;
    }
}
