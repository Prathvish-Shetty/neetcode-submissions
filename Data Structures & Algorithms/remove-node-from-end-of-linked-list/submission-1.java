/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode t = head;
        int len = 0;
        while(t != null){
            t = t.next;
            len++;
        }
        if(n == len) return head.next;
        t = head;
        for(int i = 1; i < len-n; i++){
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }
}
