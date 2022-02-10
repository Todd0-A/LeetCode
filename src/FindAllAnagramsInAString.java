import java.lang.annotation.Repeatable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */


public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
            List<Integer> Index=new ArrayList<Integer>();
            int[] pFrequency=new int[26];
            int[] sFrequency=new int[26];
            int length=p.length();
            for(int i=0;i<length;i++){
                char sChar=s.charAt(i);
                char pChar=p.charAt(i);
                pFrequency[pChar-'a']+=1;
                sFrequency[sChar-'a']+=1;
            }
            int position=length;
            while (position<s.length()){
                if (Arrays.equals(pFrequency,sFrequency)){
                    Index.add(position-length);
                }
                char sCurrent=s.charAt(position);
                sFrequency[sCurrent-'a']+=1;
                if (sFrequency[s.charAt(position-length)-'a']>0){
                    sFrequency[s.charAt(position-length)-'a']-=1;
                }
                position++;
            }
            if (Arrays.equals(pFrequency,sFrequency)){
                Index.add(position-length);
            }
            return Index;
    }
}
