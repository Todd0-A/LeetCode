import java.util.PriorityQueue;

public class MinimizeDeviationInArray {
    /*
    https://leetcode.com/problems/minimize-deviation-in-array/
     */
    public static void main(String[] args) {
        int[] nums = {2, 8, 6, 1, 6};
        System.out.println(minimumDeviation(nums));
    }

    public static int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int min = Integer.MAX_VALUE;
        int diff = min;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                nums[i] *= 2;
            }
            maxHeap.add(nums[i]);
            min = Math.min(min, nums[i]);
        }

        while (!maxHeap.isEmpty()) {
            int max = maxHeap.poll();
            diff = Math.min(diff, max - min);
            if (max % 2 == 1) {
                break;
            }
            maxHeap.add(max / 2);
            min = Math.min(min, max / 2);
        }
        return diff;
    }
}
