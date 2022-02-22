import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestInLexicographicalOrder {
    /*
    https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/
     */
    public int pre(int n,int y){
        int cnt = 0;

        long  x = y;
        long  m=1;
        while(x*10<= n) {
            cnt += m;
            x*= 10;
            m=m*10;
        }

        if(x+m<=n){
            cnt+=m;
        }else if((x+m)>n && (n>=x)){
            cnt+=(n-x+1);
        }
        return cnt;
    }
    public int findKthNumber(int n, int k) {
        //return pre(137,13);
        int ans=1;
        k--;
        int m=1;
        while(k>=0){
            int tmp=pre(n,m);
            if(tmp>k){
                k--;
                m*=10;
            }else{
                m++;
                k-=tmp;
            }
        }
        return m;
    }

}
