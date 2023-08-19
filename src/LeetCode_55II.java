/**
 * @author Enki
 * @ClassName LeetCode_55II
 * @Description: TODO
 * @Date 2023/8/18 9:28
 * @Version 1.0
 */
public class LeetCode_55II {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{1, 1, 1, 1}));


    }

    /**
     * 寻找当前可跳跃的最大长度
     */
//    static class Solution {
//        public int jump(int[] nums) {
//            if (nums.length == 1) {
//                return 0;
//            }
//            int start = 0;
//            int max = 0;
//            int time = 0;
//            int index = 0;
//            while (max < nums.length) {
//                index = start;
////                找到最远距离
//                for (int i = index; i <= nums[index] + index; i++) {
//                    if (max < nums[i] + i) {
//                        max = nums[i] + i;
//                        time++;
//                    }
//                    if (max >= nums.length - 1) return time;
////                    将最远距离元素位置记录
//                    start = max + 1;
//                }
//                if (max >= nums.length - 1) {
//                    return time;
//                }
//
//            }
//            return 0;
//
//        }
//    }

    /**
     *贪心
     */
    static class Solution {
        public int jump(int[] nums) {
            int end = 0;
            int max = 0;
            int time = 0;
            for (int i = 0; i < nums.length-1; i++) {
                max = Math.max(nums[i] + i, max);
//                选取当前边界内最大距离
                if (i == end) {
                    end = max;
                    time++;
                }
            }
            return time;

        }
    }
}
