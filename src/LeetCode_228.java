import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_228
 * @Description: TODO
 * @Date 2023/8/22 10:31
 * @Version 1.0
 */
public class LeetCode_228 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));

    }

    /**
     * 区间汇总 将数组排序，不连续的地方便是单个区间
     */
    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            Arrays.sort(nums);
            ArrayList<String> strings = new ArrayList<>();
            int start = 0;

            for (int i = 1; i < nums.length; i++) {
                long res = nums[i] - nums[i - 1];
                if (Math.abs(res) > 1) {
                    if (nums[start] == nums[i - 1]) {
                        String s = nums[start] + "";
                        strings.add(s);
                    } else {
                        String s = nums[start] + "->" + nums[i - 1];
                        strings.add(s);
                    }
                    start = i;
                }
//                if (i == nums.length - 1 && nums[i] - nums[i - 1] > 1) {
//                    String s = nums[i] + "";
//                    strings.add(s);
//                }
            }
            if (start <= nums.length - 1) {
                if (start == nums.length - 1) {
                    String s = nums[start] + "";
                    strings.add(s);
                } else {
                    String s = nums[start] + "->" + nums[nums.length - 1];
                    strings.add(s);
                }
            }

            return strings;
        }
    }
}
