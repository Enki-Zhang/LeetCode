package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_303 {
    public static void main(String[] args) {

    }


}

/**
 * 构造前缀和数组计算前n元素的和
 */
class NumArray {
    private int[] prefix;

    /**
     * 通过输入数组构造完整的前缀和数组
     * @param nums 输入数组
     */
    public NumArray(int[] nums) {
        prefix = new int[nums.length+1]; //第一个位置保存0 方便计算
        prefix[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right+1] - prefix[left];
    }
}
