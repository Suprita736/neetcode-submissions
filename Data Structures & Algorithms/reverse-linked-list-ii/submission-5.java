class Solution {
    int i = 1;
    ListNode first = null;
    ListNode last = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        if(left == 1) return reverse(head, left, right);
        ListNode temp = head;
        while(i < left){
            if(i == left-1) first = temp;
            temp = temp.next;
            i++;
        }
        first.next = reverse(temp, left, right);
        return head;
    }
    public ListNode reverse(ListNode head, int left, int right) {
        if(i == right){
            if(head.next == null) {
                last = null;
                return head;
            }
            else {
                last = head.next;
                return head;
            }
        }
        i++;
        ListNode newNode = reverse(head.next,left,right);
        head.next.next = head;
        head.next = last;
        return newNode;
    }
}







