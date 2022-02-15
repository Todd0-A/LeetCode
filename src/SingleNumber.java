import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    /*
    https://leetcode.com/problems/single-number/
     */
    public int singleNumber(int[] nums) {
        int x=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                x = entry.getKey();
                break;
            }
        }
        return x;
    }
}
