import java.util.Arrays;
import java.util.Map;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_128 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1,2,0,1};
        int i = solution.longestConsecutive(ints);
        System.out.println(i);

    }

    /**
     * 最长连续序列 排序后从前往后遍历
     */
    static class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length==0)
            {
                return 0;
            }
            Arrays.sort(nums);
//            使用指针截取有序的数组 数组中有重复的元素 去重
            int left = 0;
            int right = left +1;
            int max =1;
            int length = 1;
            while (right < nums.length) {
                while (nums[left] == nums[left+1]) left++;
                length++;
                while (nums[right] == nums[right+1]) right++;
                length++;
                if (Math.abs(nums[left] - nums[right]) == 1) {
                    length++;
                    right++;
                    left++;
                    max = Math.max(length,max);
                }else {
                    left++;
                    right = left + 1;
                    length =1;
                }
            }

            return max;



        }
    }
}
