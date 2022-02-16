public class SwapNodesInPairs {
    /*
    https://leetcode.com/problems/swap-nodes-in-pairs/
     */
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        ListNode temp=head;
        int count=1;
        while (temp.next!=null){
            if(count%2!=0){
            int t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
}
