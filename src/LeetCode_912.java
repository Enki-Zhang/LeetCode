import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_912
 * @Description: TODO
 * @Date 2023/8/22 11:39
 * @Version 1.0
 */
public class LeetCode_912 {
    public static void main(String[] args) {
////        控制台输入
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] strings = new String[n];
//        scanner.nextLine();//将键入的数字后面的换行符吸收掉
//        for (int i = 0; i < n; i++) {
//            strings[i] = scanner.nextLine();
//        }
        Solution solution = new Solution();
        System.out.println(solution.sortArray(new int[]{5, 2, 3, 1}));
    }

    /**
     * 排序
     */
    static class Solution {
        public int[] sortArray(int[] nums) {
            return quickArray(nums);

        }

        /**
         * 快排 递归的选择一个基准 根据基准进行分类排序
         *
         * @param nums
         * @return
         */
        public int[] quickArray(int[] nums) {
            return quickSort(nums, 0, nums.length - 1);
        }

        /**
         * 每趟排序选取一个基准 将未排序的数组通过基准进行分开
         *
         * @param nums
         * @param left
         * @param right
         * @return
         */
        private int[] quickSort(int[] nums, int left, int right) {
            if (left < right) {
                int index = div(nums, left, right);
                quickSort(nums, left, index - 1);
                quickSort(nums, index + 1, right);
            }
            return nums;
        }

        /**
         * 将第一个数字作为基准
         *
         * @param nums
         * @param left
         * @param right
         * @return
         */
        private int div(int[] nums, int left, int right) {
            int temp = nums[left];
            while (left < right) {
                while (left < right && nums[right] >= temp) right--;
                nums[left] = nums[right];
                while (left < right && nums[left] <= temp) left++;
                nums[right] = nums[left];
            }
            nums[left] = temp;
            return left;
        }


        /**
         * 冒泡排序 依次比较相邻元素 不满足顺序则交换
         * 容易超时
         *
         * @param nums
         * @return
         */
        public int[] bubblingSorting(int[] nums) {
//            i 表示需要排列的趟数
            for (int i = 0; i < nums.length - 1; i++) {
//                j表示需要比较的元素的范围 每一趟都能确定一个元素的位置
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        swap(nums, j, j + 1);
                    }
                }
            }
            return nums;
        }

        private void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

    }
}
