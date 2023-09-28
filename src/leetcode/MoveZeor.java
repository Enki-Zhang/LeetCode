package leetcode;

/**
 * @author Enki
 * @ClassName MoveZeor
 * @Description: TODO
 * @Date 2023/9/27 10:44
 * @Version 1.0
 */
public class MoveZeor {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,0,0};
        move(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
    private static void move(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[index--] = nums[i];
            }
        }
        while (index >=0) {
            nums[index--] = 0;
        }
    }
}
