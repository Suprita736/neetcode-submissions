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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        int r = 0,d = 0;
        while(temp.next != null){
            r = 0;
            d = 0;
            int a = temp.val;
            int b = temp.next.val;
            if(a > b) {
                while(b != 0){
                    d = a/b;
                    r = a%b;
                    a = b;
                    b = r;
                }
                ListNode div = new ListNode(a);
                div.next = temp.next;
                temp.next = div;
                temp = temp.next.next;
            }
            else {
                while(a != 0){
                    d = b/a;
                    r = b%a;
                    b = a;
                    a = r;
                }
                ListNode div = new ListNode(b);
                div.next = temp.next;
                temp.next = div;
                temp = temp.next.next;
            }
        }
        return head;
    }
}