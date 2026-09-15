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
    int i = 1;
    ListNode first = null;
    ListNode last = null;
    ListNode mid = null;
    public ListNode reverse(ListNode head,int k){
        if(head == null) {
            last = null;
            return head;
        }
        if(i == k){
            last = head.next;
            return head;
        }
        i++;
        ListNode newNode = reverse(head.next, k);
        if(newNode != null){
            head.next.next = head;
            head.next = last;
        }
        if(newNode == null) return newNode;
        return newNode;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        first = head;
        last = head;
        while(last != null){
            i = 1;
            if(first == head){
                head = reverse(first, k);
            }
            else{
                mid = first;
                first = last;
                mid.next = reverse(first, k);
                if(mid.next == null) mid.next = first;
            }
        }
        return head;
    }
}