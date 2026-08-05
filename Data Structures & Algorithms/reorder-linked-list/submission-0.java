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
    private ListNode reverse(ListNode head){
        ListNode pre = null, cur = head;
        while(cur != null){
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
    private ListNode findMid(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode reverseMidHead = reverse(mid);
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy, t2 = head, t3 = reverseMidHead;
        while(t2 != null && t3 != null){
            t1.next = t2;
            t1 = t1.next;
            t2 = t2.next;
            t1.next = t3;
            t3 = t3.next;
            t1 = t1.next;
        }
        if(t2 != null) t1.next = t2;
        if(t3 != null) t1.next = t3;
        head = dummy.next;
    }
}
