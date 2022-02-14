import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationInString {
    /*
    https://leetcode.com/problems/permutation-in-string/
     */

    public boolean checkInclusion(String s1, String s2) {
        int[] s1Frequency=new int[26];
        int[] s2Frequency=new int[26];
        int length=s1.length();
        if(s1.length()>s2.length()){
            return false;
        }

        for(int i=0;i<length;i++){
            char s1Char=s1.charAt(i);
            char s2Char=s2.charAt(i);
            s1Frequency[s1Char-'a']+=1;
            s2Frequency[s2Char-'a']+=1;
        }
        int position=length;
        while (position<s2.length()){
            if (Arrays.equals(s1Frequency,s2Frequency)){
                return true;
            }
            char sCurrent=s2.charAt(position);
            s2Frequency[sCurrent-'a']+=1;
            if (s2Frequency[s2.charAt(position-length)-'a']>0){
                s2Frequency[s2.charAt(position-length)-'a']-=1;
            }
            position++;
        }
        if (Arrays.equals(s1Frequency,s2Frequency)){
            return  true;
        }
        return false;
    }
}
