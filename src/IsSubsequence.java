public class IsSubsequence {
    /*
    https://leetcode.com/problems/is-subsequence/
     */
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        if(s.length()==0)
            return true;
        int len=t.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(t.charAt(i)==s.charAt(count))
                count++;
            if(count==s.length())
                return true;
        }
        return false;
    }
}
