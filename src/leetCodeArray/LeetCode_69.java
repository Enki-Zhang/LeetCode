package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_69 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int target = 0;
        int[] targetArray = Solution.removeElement(nums, val);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                target++;
            }
        }
        System.out.println("array"+Arrays.toString(targetArray));
        for (int i=0;i<target;i++)
        {
            System.out.println(targetArray[i]);
        }




    }


    static class Solution {
        public static int[] removeElement(int[] nums, int val) {
            int target = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    target++;
                }
            }
            int[] targetNums = delArray(nums, val, target);
            return targetNums;
//            System.out.println();

        }

        public static int[] delArray(int[] nums, int x, int target) {
//            pointA标记目标 pointB标记要前移的元素
            int pointA = 0;
            int pointB = 1;
            int a;
            while (pointA < nums.length) {

                while (nums[pointA] == x && pointA < nums.length - target) {
                    a = pointA;
                    pointB = a + 1;
                    for (int j = pointA; j < nums.length && pointB < nums.length; j++, a++, pointB++) {
                        nums[a] = nums[pointB];
                    }

                }
                pointA++;
            }
            return nums;
        }




    }
}
