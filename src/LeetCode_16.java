import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_16 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {-1,2,1,-4};
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
            int index = 0;
            int min = 0;
            for (int i = 0; i < nums.length; i++) {
                int left = index + 1;
                int right = nums.length - 1;
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];

//                    当前差距
                    int length = Math.abs(sum - target);
//                    差距比上一次小
                    if (length < min) {
//                        继续缩小
                        left++;
                    }
                    if (length > min) {
//                        缩小差距
                        right--;
                    }
                    if (length == min) {
                        while (left < right && nums[left] == nums[left-1]) {
                            left--;
                        }
                        while (left < right && nums[right] == nums[right+1]) {
                            right++;
                        }
                    }
                    min = Math.min(min, length);


                }
            }

            return min;
        }
    }
}
