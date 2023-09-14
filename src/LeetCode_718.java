/**
 * @author Enki
 * @ClassName LeetCode_718
 * @Description: TODO
 * @Date 2023/9/10 9:05
 * @Version 1.0
 */
public class LeetCode_718 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLength(new int[]{1,2,3,2,8}, new int[]{5,6,1,4,7}));

    }

    /**
     * 滑动窗口 暴力
     */
    static class Solution1 {
        public int findLength(int[] nums1, int[] nums2) {
            int max = find(nums1, nums2);
            int length = find(nums2, nums1);
            return Math.max(max, length);

        }

        private int find(int[] nums1, int[] nums2) {
            int start1 = 0;
            int start2 = 0;
            int len = 0;
            int max = 0;
            while (start1 < nums1.length && start2 < nums2.length) {
                if (nums1[start1] != nums2[start2]) {
                    start1++;
                    len = 0;
                    start2 = 0;
                } else {
                    start1++;
                    start2++;
                    len++;
                    max = Math.max(len, max);
                }
            }
            return max;
        }
    }

    static class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length][nums2.length];
            int max = 0;

//            System.out.println(dp.length);
//            行
            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] == nums1[0]) {
                    dp[0][i] = 1;
                }
                max = Math.max(dp[0][i],max);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums2[0]) {
                    dp[i][0] = 1;
                }
                max = Math.max(dp[i][0],max);
            }

            for (int i = 1; i < nums1.length; i++) {
                for (int j = 1; j < nums2.length; j++) {
                    if (nums1[i]==nums2[j]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = 0;
                    }
                    max = Math.max(dp[i][j],max);
                }
            }
            return max;

        }
    }
}
