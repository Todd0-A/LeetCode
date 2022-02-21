import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*
    https://leetcode.com/problems/majority-element/
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int max = 0;
        int key=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > max) {
                max = entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }
}
