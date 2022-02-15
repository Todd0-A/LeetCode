import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {
    /*
    https://leetcode.com/problems/linked-list-random-node/
     */
    List<Integer> l;
    Random rnd;
    public LinkedListRandomNode(ListNode head) {
        l = new LinkedList<>();
        rnd = new Random();

        ListNode curr = head;

        while(curr != null){
            l.add(curr.val);
            curr = curr.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        return l.get(rnd.nextInt(l.size()));
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
