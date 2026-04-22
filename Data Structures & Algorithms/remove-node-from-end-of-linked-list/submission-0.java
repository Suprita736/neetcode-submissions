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
        ListNode temp = head;
        int size = 0,count = 1;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        if(size == n) {
            head = head.next;
            return head;
        }
        while(count != (size - n)){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
