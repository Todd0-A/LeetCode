import java.util.List;

public class ComplementofBase10Integer {
    /*
    https://leetcode.com/problems/complement-of-base-10-integer/
     */
    public int bitwiseComplement(int n) {
        char[] num=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<num.length;i++){
            if(num[i]=='0')
                num[i]='1';
            else
                num[i]='0';
        }
        n=Integer.parseInt(String.valueOf(num),2);
        return n;
    }
}
