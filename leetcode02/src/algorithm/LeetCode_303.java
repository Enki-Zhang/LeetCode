package algorithm;

/**
 * @ClassName LeetCode_303
 * @Description TODO
 * @Author Enki
 * @Date 2025/1/14 16:51
 * @Verison 1.0
 **/
public class LeetCode_303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int i = numArray.sumRange(0, 2);
        System.out.println(i);

    }

    static class NumArray {
        int[] result;

        //  初始化前缀和
        public NumArray(int[] nums) {
            result = new int[nums.length + 1];
            result[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                result[i + 1] = result[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            // 计算前缀和
            return result[right + 1] - result[left];

        }
    }
}
