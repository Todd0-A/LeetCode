import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    /*
    https://leetcode.com/problems/find-the-difference/
     */
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char sChar:s.toCharArray()){
            map.put(sChar, map.getOrDefault(sChar,0)+1);
        }
        for(char tChar:t.toCharArray()){
            if(!map.containsKey(tChar)||map.get(tChar)==0){
                return tChar;
            }else{
                map.put(tChar,map.getOrDefault(tChar,0)-1);
            }
        }
        return ' ';
    }
}
