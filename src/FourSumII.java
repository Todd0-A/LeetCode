import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSumII {
    /*

     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:nums1){
            for (int j:nums2){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        for (int k:nums3) {
            for (int l : nums4) {
                sum += map.getOrDefault(-(k + l), 0);
            }
        }
        return sum;
    }
}
