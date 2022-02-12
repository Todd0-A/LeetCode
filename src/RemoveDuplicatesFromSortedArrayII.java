import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    /*
    Problem:
    https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

    111222333
     */
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int index=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[index-2]){
                nums[index]=nums[i];
                index++;
            }
        }
        System.out.println(index);
        return nums;
    }
}
