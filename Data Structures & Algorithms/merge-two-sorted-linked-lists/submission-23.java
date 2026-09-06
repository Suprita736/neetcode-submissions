class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode t = list1;
        ListNode head = list1;
        if(list2.val < list1.val){
            t = list2;
            head = list2;
        }
        while(temp1 != null && temp2 != null){
            if(t == temp1 && temp1.val <= temp2.val){
                if(temp1.next != null && temp1.next.val <= temp2.val){
                    temp1 = temp1.next;
                    t = t.next;
                } 
                else{
                    temp1 = temp1.next;
                    t.next = temp2;
                    t = t.next;
                }
            }
            else {
                if(temp2.next != null && temp2.next.val <= temp1.val){
                    temp2 = temp2.next;
                    t = t.next;
                } 
                else{
                    temp2 = temp2.next;
                    t.next = temp1;
                    t = t.next;
                }
            }
        }
        // if(t.next == null && t == temp1){
        //     t.next = temp2;
        // }
        // else if(t.next == null && t == temp2){
        //     t.next = temp1;
        // }
        return head;
    }
}