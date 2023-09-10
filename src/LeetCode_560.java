import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_560
 * @Description: TODO
 * @Date 2023/9/2 11:05
 * @Version 1.0
 */
public class LeetCode_560 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subarraySum(new int[]{1, 1, 1}, 2));
    }

    /**
     * 分割 去重
     */
    static class Solution {

        int count = 0;

        public int subarraySum(int[] nums, int k) {
            back(nums, k, 0, 0);
            return count;
        }

        private void back(int[] nums, int k, int start, int a) {
            if (start >= nums.length) {
//                count++
                return;
            }
            for (int i = start; i < nums.length; i++) {
                a += nums[i];
                if (a == k) {
                    count++;
                }
            }
            back(nums, k, start + 1, 0);

        }
    }

//    static class Solution {
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        public List<List<Integer>> subarraySum(int[] nums, int k) {
//            back(nums, k, 0, 0);
//            return lists;
//        }
//
//        private void back(int[] nums, int k, int start, int currentSum) {
//            if (currentSum == k) {
//                lists.add(new ArrayList<>(list));
//            }
//
//            for (int i = start; i < nums.length; i++) {
//                currentSum += nums[i];
//                list.add(nums[i]);
//
//
//
//                // 继续尝试下一个元素
//                back(nums, k, i + 1,  currentSum);
//
//                // 回溯，移除当前元素
//                list.remove(list.size() - 1);
//                currentSum -= nums[i];
//            }
//        }
//    }
}
