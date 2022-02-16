import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheTownJudge {
    /*
    https://leetcode.com/problems/find-the-town-judge/
     */
    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
            map1.put(trust[i][0],map.getOrDefault(trust[i][0],0)+1);
        }
        for(int i=1;i<=n;i++){
            if(map.getOrDefault(i,0)==(n-1)&&!map1.containsKey(i))
                return i;
        }
        return -1;
    }
}
