public class SubarraySumEqualsK {
    /*
    https://leetcode.com/problems/subarray-sum-equals-k/
     */
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                sum+=nums[j];
                if (sum==k){
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }
}
