/**
 * @author Enki
 * @ClassName LeetCode_377
 * @Description: TODO
 * @Date 2023/9/12 9:31
 * @Version 1.0
 */
public class LeetCode_377 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum4(new int[]{1, 2, 3}, 4));


    }

    /**
     *
     */
    static class Solution {
        int count = 0;

        public int combinationSum4(int[] nums, int target) {
            back(nums, target, 0, 0);
            return count;
        }

        private void back(int[] nums, int target, int start, int sum) {
            if (sum == target) {
                count++;
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > target)
                    continue;
                back(nums,target,i,sum);
                sum-=nums[i];
            }
        }
    }
}
