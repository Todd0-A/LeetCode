import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
    /*
    https://leetcode.com/problems/k-diff-pairs-in-an-array/
     */
    public static void main(String[] args) {
        int[] nums={1,2,4,4,3,3,0,9,2,3};
        int k=0;
        System.out.println(findPairs(nums,k));
    }
    public static int findPairs(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums)
            map.put(i, map.getOrDefault(i,0)+1);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(map.containsKey(entry.getKey()+k) && k!=0)
                count++;
            else if(k==0 && entry.getValue()>1)
                count++;
        }
        return count;
    }
}
