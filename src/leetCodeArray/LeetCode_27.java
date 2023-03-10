package leetCodeArray;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_27 {
}
class Solution {
    public static int removeElement(int[] nums, int val) {
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                target++;
            }
        }
        nums = delArray(nums, val, target);
        // System.out.println(Arrays.toString(targetNums));
        return  (nums.length-target);
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