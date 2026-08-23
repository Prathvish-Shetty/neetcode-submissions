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
        ListNode head = new ListNode(-1);
        ListNode h = head;
        while(!pq.isEmpty()){
            ListNode t = pq.peek();
            if(h.next == null){ 
                h.next = t;
                pq.poll();
            }
            else if(h.next.val > t.val){
                pq.offer(h.next);
                h.next = t;
                pq.poll();
            } else h = h.next;
        }
        return head.next;
    }
}
