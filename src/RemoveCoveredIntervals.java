import java.util.Arrays;

public class RemoveCoveredIntervals {
    /*
    https://leetcode.com/problems/remove-covered-intervals/
     */
    public static void main(String[] args) {
        int [][] i={{1,4},{3,6},{2,8}};
        System.out.println(removeCoveredIntervals(i));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        int res = 0, left = -1, right = -1;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int[] v : intervals) {
            if (v[0] > left && v[1] > right) {
                left = v[0];
                ++res;
            }
            right = Math.max(right, v[1]);
        }
        return res;
    }

}
