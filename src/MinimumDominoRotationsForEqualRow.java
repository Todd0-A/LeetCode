import java.util.HashMap;
import java.util.Map;

public class MinimumDominoRotationsForEqualRow {
    /*
    https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
     */
    public int minDominoRotations(int[] tops, int[] bottoms) {
        return  Math.min(min(tops,bottoms,0),min(bottoms,tops,0));
    }
    public int min(int[] tops,int[] bottoms,int x){
        int num=tops[x];
        int count=0;
        int n=bottoms.length;
        for(int i=0;i<n;i++){
            if(tops[i]!=num && bottoms[i]==num){
                count++;
            }else if(tops[i]!=num && bottoms[i]!=num){
                if(num==tops[n-1])
                    return -1;
                else
                    return min(tops,bottoms,x+1);
            }
        }
        return count;
    }
}
