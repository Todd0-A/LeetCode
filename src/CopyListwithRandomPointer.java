import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CopyListwithRandomPointer {
    /*
    https://leetcode.com/problems/copy-list-with-random-pointer/
     */
    public RNode copyRandomList(RNode head) {
        if (head == null) return null;

        Map<RNode, RNode> map = new HashMap<RNode, RNode>();
        RNode node = head;
        while (node != null) {
            map.put(node, new RNode(node.val));
            node = node.next;
        }

        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
class RNode {
    int val;
    RNode next;
    RNode random;

    public RNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}