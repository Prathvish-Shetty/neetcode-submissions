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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val-b.val); // minHeap
        for(ListNode list : lists) if(list != null) pq.offer(list);
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(!pq.isEmpty()){
            prev.next = pq.poll();
            prev = prev.next;
            if(prev.next != null) pq.offer(prev.next);
        }
        return dummy.next;
    }
}
