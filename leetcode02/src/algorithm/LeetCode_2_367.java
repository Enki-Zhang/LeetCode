package algorithm;

/**
 * @ClassName LeetCode_2_367
 * @Description 完全平方数
 * @Author Enki
 * @Date 2024/8/28 10:40
 * @Verison 1.0
 **/
public class LeetCode_2_367 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(808201);


    }

    static class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 1) {
                return true;
            }
            int length = num >> 1;//向下取整
            int left = 1;
            int right = length;
//            if (right < 1) {
//                return false;
//            }
            int mid = 0;
            long tar = 0;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                 tar = (long) mid * mid;
                if (tar > num) {
                    right = mid - 1;
                }
                if (tar < num) {
                    left = mid + 1;
                }
                if (tar == num) {
                    return true;
                }
            }
            return false;
        }
    }
}
