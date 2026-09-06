class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        Stack<ListNode> st = new Stack<>();
        int count = 0;
        ListNode temp1 = head;
        ListNode mid = head;
        while(temp1.next != null) {
            temp1 = temp1.next;
            count++;
        }
        int n = 0;
        temp1 = head;
        while(temp1 != null) {
            if(n <= (1+count)/2){
                n++;
                temp1 = temp1.next;
            }
            else {
                st.push(temp1);
                temp1 = temp1.next;
            }
        }
        temp1 = head;
        while(!st.isEmpty()){
            st.peek().next = temp1.next;
            temp1.next = st.peek();
            temp1 = st.peek().next;
            st.pop();
        }
        if(count % 2 == 0) temp1.next = null;
        else if(count % 2 != 0) temp1.next.next = null;
    }
}
