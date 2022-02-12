import java.util.ArrayList;
import java.util.List;
/*
       You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
   Merge all the linked-lists into one sorted linked-list and return it.

   Example 1:

   Input: lists = [[1,4,5],[1,3,4],[2,6]]
   Output: [1,1,2,3,4,4,5,6]
   Explanation: The linked-lists are:
   [
     1->4->5,
     1->3->4,
     2->6
   ]
   merging them into one sorted list:
   1->1->2->3->4->4->5->6
    */


public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length ==0) return null;
        return  mergeKLists(lists,0,lists.length-1);

    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end){
        if(start == end) return lists[start];
        int mid = start + (end - start)/2;

        ListNode left  = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid+1, end);

        return merge2Lists(left,right);

    }
    private ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode curr = head;

        while(l1 !=null || l2 !=null){
            if(l1 == null){
                curr.next = l2;
                l2 = l2.next;
            }  else if(l2 == null){
                curr.next = l1;
                l1 = l1.next;
            }  else{
                if(l2.val > l1.val){
                    curr.next = l1;
                    l1 = l1.next;
                }else{
                    curr.next = l2;
                    l2 = l2.next;
                }
            }
            curr = curr.next;
        }
        return head.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }