import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_16 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {-1, 2, 1, -4};
        int i = solution.threeSumClosest(ints, 1);
        System.out.println(i);
    }

    /**
     * 最接近的三数之和  将每个三元组进行判断 差距大小
     * 找到差距较小的和 当和比之前大时 右指针左移 小于指针右移
     */
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int min = Integer.MAX_VALUE;
            int a = 0;
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int res = nums[i] + nums[left] + nums[right];
                    int cha = Math.abs(res - target);
                    if (cha < min) {
                        min = cha;
                        a = res;
                    }
                    if (res == target) {
                        return res;
                    } else if (res > target) {
                        right--;
                    } else {
                        left++;
                    }
                }

            }
            return a;
        }
    }
}
