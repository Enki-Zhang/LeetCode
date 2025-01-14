package hashmap;

import java.util.*;

/**
 * @ClassName LeetCode15
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/11 10:40
 * @Verison 1.0
 **/
public class LeetCode15 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new LeetCode15().new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            ArrayList<Integer> integers = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();

            for (int first = 0; first < nums.length - 2; first++) {
                // 向前去重
                if (first > 0 && nums[first] == nums[first - 1]) continue;
                int second = first + 1;
                int end = nums.length - 1;
                while (second < end) {
                    int sum = nums[first] + nums[second] + nums[end];
                    if (sum == 0) {
                        integers.add(nums[first]);
                        integers.add(nums[second]);
                        integers.add(nums[end]);
                        result.add(new ArrayList<>(integers));
                        integers.clear();
                        while (second < end && nums[second] == nums[second + 1]) second++;
                        while (end > second && nums[end] == nums[end - 1]) end--;
                        second++;
                        end--;
                    } else if (sum > 0) {
                        end--;
                    } else {
                        second++;
                    }
                }
            }

            return result;
        }
    }
}
