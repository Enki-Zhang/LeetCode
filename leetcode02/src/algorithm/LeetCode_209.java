package algorithm;

<<<<<<< HEAD
/**
 * @author Enki
 * @ClassName LeetCode_209
 * @Description: TODO
 * @Date 2024/9/19 20:41
 * @Version 1.0
 */
public class LeetCode_209 {
    public static void main(String[] args) {

    }

    /**
     * 长度最小的子串
     */
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
//            找到合适的子数组 -> 滑动窗口 sum 加上有边界的数值 当条件大于目标后 缩小边界
            int left = 0;
            int right = 0;
            int sum = 0;
            int len = Integer.MAX_VALUE;
//            滑动窗口将数据进行记录 当数据大于目标值时候 进行缩小窗口 并更新长度 直到不满足条件
            for (right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum > target && left < right) {
                    sum -= nums[left];
                    left++;
                    len = Math.min(len, right - left + 1);
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;

=======
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
            //使用滑动窗口 找到数组中满足条件的子数组
            int start = 0;
            int end = 0;
            int sum = 0;//目标比较
            int len = Integer.MAX_VALUE; //数组长度
//            start从头遍历 end从start开始寻找满足条件的数组
            for (end = 0; end < nums.length; end++) {
                sum += nums[end];
                while (sum >= target) {
                    len = Math.min(len, end - start + 1);
                    sum -= nums[start];
                    start++;//窗口后移

                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;
>>>>>>> 2a14402fcab353ce4176756daad3432e1d08a257
        }
    }
}
