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
        PriorityQueue<Integer> q = new PriorityQueue<>();
        if(lists.length == 0) return null;
        for(int i=0;i<lists.length;i++) {
            if(lists[i] == null) continue;
            ListNode temp = lists[i];
            while(temp != null) {
                q.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        if(q.isEmpty()) return null;
        while(!q.isEmpty()) {
            if(head == null) {
                head = new ListNode(q.poll());
                temp = head;
            }
            else{
                temp.next = new ListNode(q.poll());
                temp = temp.next;
            }
        }
        head = head.next;
        temp.next = null;
        return head;
    }
}
