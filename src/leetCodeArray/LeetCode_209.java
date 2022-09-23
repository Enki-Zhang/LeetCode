package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
//        int i = Solution.minSubArrayLen(target, nums);
        int i = Solution_02.minSubArrayLen_2(target, nums);

//        System.out.println(Arrays.toString(i));
        System.out.println(i);
    }


    //解法1：
    //  新开一个数组记录每个满足条件的子串长度  返回除去0以外的最小数字
    static class Solution {
        public static int minSubArrayLen(int target, int[] nums) {
            int[] indexNums = new int[5];
            int sum = 0;
            int pointB = 0;
            int indexNumsLength = 0;
            for (int i = 0; i < nums.length; i++) {
                pointB = i;
                sum = 0;
                while (pointB < nums.length) {
                    sum += nums[pointB];
                    if (sum < target) {
                        pointB++;
                        indexNums[i] = 0;
                    } else if (sum >= target) {
                        indexNumsLength = pointB - i + 1;
                        indexNums[i] = indexNumsLength;
                        break;
                    }
                }
            }
            int minNotZero = indexNums[0];
            for (int i = 0; i < indexNums.length; i++) {
                if (indexNums[i] != 0 && minNotZero > indexNums[i]) {
                    minNotZero = indexNums[i];
                }
            }
            return minNotZero;
        }
    }

    //    解法2滑动窗口
    static class Solution_02 {
        public static int minSubArrayLen_2(int target, int[] nums) {
            int sum = 0;
            int min = nums.length;
            int left = 0;
            int length = 0;
            boolean isHas = false;
//            用右指针做边界判定，同时扩大窗口,条件不满足用左指针缩小窗口，同时完成指针后移
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    isHas = true;
                    length = right - left + 1;
                    min = Math.min(min, length);
                    //滑动窗口 移动左边的指针减小窗口并去掉窗口外面的元素 如何条件不符合继续扩大窗口
                    sum -= nums[left++];
                }
            }
            if (isHas) {
                return min;
            }
            return 0;

        }

    }


}
