import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    /*
    Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.



    Example 1:

    Input: nums = [0,1]
    Output: 2
    Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
     */
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) { // Base Case
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum)){
                int last = map.get(sum);
                max = Math.max(max, i - last);
            }
            else{
                map.put(sum, i);
            }
        }
        return max;
    }
}
