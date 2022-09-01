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
         Queue<Integer> minHeap = new PriorityQueue<>();

        for(ListNode head : lists) {
            while(head != null) {
                minHeap.add(head.val);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(!minHeap.isEmpty()) {
            current.next = new ListNode(minHeap.poll());
            current = current.next;
        }
        return dummy.next;

}

}