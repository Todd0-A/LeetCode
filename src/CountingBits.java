public class CountingBits {
    /*
    https://leetcode.com/problems/counting-bits/
     */
    public int[] countBits(int n) {
        int[] list=new int[n+1];
        for(int i=0;i<n+1;i++)
            list[i]=getNumber(i);
        return list;
    }

    public  int getNumber(int n){
        int count=0;
        while(true){
            int k=n%2;
            if(k==1)
                count++;
            n=(n-k)/2;
            if(n<2){
                if(n==1)
                    count++;
                break;
            }
        }
        return count;
    }

}
