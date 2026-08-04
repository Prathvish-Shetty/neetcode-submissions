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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1, head2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode head3 = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                head3.next = head1;
                head1 = head1.next;
            } 
            else{
                head3.next = head2;
                head2 = head2.next;
            }
            head3 = head3.next;
        }
        if(head1 != null) head3.next = head1;
        if(head2 != null) head3.next = head2;
        return dummy.next;
    }
}