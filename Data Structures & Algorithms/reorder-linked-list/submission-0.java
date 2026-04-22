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
    public void reorderList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode newNode = new ListNode();
        ListNode temp = head;
        int size = 0,count = 0;
        while(temp != null){
            s.push(temp);
            size++;
            temp = temp.next;
        }
        count = size;
        temp = head;
        ListNode temp1 = null;
        while(count != size/2){
            temp1 = s.pop();
            temp1.next = temp.next;
            temp.next = temp1;
            temp = temp1.next;
            count--;
        }
        if(size % 2 == 0) temp1.next = null;
        else temp1.next.next = null;
        System.out.println(head);
    }
}
