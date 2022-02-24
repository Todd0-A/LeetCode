public class SortList {
    /*
    https://leetcode.com/problems/sort-list/
     */
    public ListNode sortList(ListNode head) {
        if(head == null||head.next==null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = head;
        while(p2 != null && p2.next != null){
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        pre.next = null;
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(p1);
        return merge(h1, h2);

    }
    public ListNode merge(ListNode h1, ListNode h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        if(h1.val < h2.val){
            h1.next = merge(h1.next, h2);
            return h1;
        }
        else{
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }

}

