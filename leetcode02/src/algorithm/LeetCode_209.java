package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @ClassName LeetCode_209
 * @Description TODO
 * @Author Enki
 * @Date 2024/9/6 10:38
 * @Verison 1.0
 **/
public class LeetCode_209 {
    public static void main(String[] args) {
        Integer[] nums = {2, 3, 1, 2, 4, 3};
        Arrays.stream(nums).collect(Collectors.toList());
//        Collections.sort();

    }

    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
//            将数组从大到小排序 从头开始递减每个元素 若第一个元素大于目标值已经超出边界
//            2. 不断递减直到0
//            反转数组
            int len = 0;

            int[] ints = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

            for (int i = 0; i < nums.length; i++) {
                if (target != 0) {

                }
            }
            return 0;

        }
    }
}
