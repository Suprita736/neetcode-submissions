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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode l3 = new ListNode();
        ListNode t3 = l3;
        int sum = 0,p = 0;
        while(t1 != null || t2 != null){
            if(t1 != null && t2 != null){
                sum = t1.val + t2.val + p;
                t1 = t1.next;
                t2 = t2.next;
            }
            else if(t1 != null && t2 == null){
                sum = t1.val + p;
                t1 = t1.next;
            }
            else if(t1 == null && t2 != null){
                sum = t2.val + p;
                t2 = t2.next;
            }
            if(l3 == null){
                l3.val = sum % 10;
                t3 = l3;
            }
            else{
                t3.next = new ListNode();
                t3.next.val = sum % 10;
                t3 = t3.next;
            }
            p = sum / 10;
            sum = 0;
        }
        l3 = l3.next;
        if(p != 0){
            t3.next = new ListNode();
            t3.next.val = p;
            t3 = t3.next;
            t3.next = null;
        }
        return l3;
    }
}
