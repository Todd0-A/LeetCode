public class AddTwoNumbers {
    /*
    https://leetcode.com/problems/add-two-numbers/
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=l1;
        ListNode temp=head;
        int next=0;
        int val=0;
        while(true){
            if(l1!=null) {
                val += l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                val += l2.val;
                l2=l2.next;
            }
            temp.next=new ListNode((val+next)%10);
            next=val/10;
            val=0;
            temp=temp.next;
            if(l1==null && l2==null)
                break;
        }
        return head.next;
    }
}
