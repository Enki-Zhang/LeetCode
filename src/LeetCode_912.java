import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.PriorityQueue;
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Solution3 solution = new Solution3();
        int[] ints = solution.sortArray(nums);
        for (int a :
                ints) {
            System.out.println(a);
        }
    }

    /**
     * 排序
     */
    static class Solution {
        public int[] sortArray(int[] nums) {
            return quickSort(nums, 0, nums.length - 1);
        }

        public int[] quickSort(int[] nums, int left, int right) {
            if (left < right) {
                int index = div(nums, left, right);
                div(nums, left, index - 1);
                div(nums, index + 1, right);
            }
            return nums;
        }

        public int div(int[] nums, int left, int right) {
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

        /**
         * 选择排序 每趟选择一个最小的元素放到未排序队列的头
         *
         * @param nums
         * @return
         */
        private int[] selectSort(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[min] > nums[j]) {
                        min = j;
                    }
                }
                swap(nums, min, i);
            }
            return nums;
        }

        /**
         * 堆排序 构建大根堆每次取出根节点后将堆底元素放入到根节点位置后重新排列
         *
         * @param nums
         */
        private int[] heapSorting(int[] nums) {
            int n = nums.length;
//            n/2-1 是最后一个叶子节点的父节点
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapAdj(nums, n, i);
            }
// 取出堆顶元素 重新调整
            for (int i = n - 1; i >= 0; i--) {
                swap(nums, 0, i);
                heapAdj(nums, i, 0);
            }
            return nums;
        }

        /**
         * 构建大根堆
         *
         * @param nums   数组
         * @param length 数组长度
         * @param i      父节点位置
         */
        private void heapAdj(int[] nums, int length, int i) {
            int largest = i;//三个节点中的最大值位置
            int lChild = 2 * i + 1;
            int rChild = 2 * i + 2;
//            找到节点中的最大值
            if (lChild < length && nums[lChild] > nums[largest]) {
                largest = lChild;
            }
            if (rChild < length && nums[rChild] > nums[largest]) {
                largest = rChild;
            }
//            最大值不是根节点 进行交换
            if (largest != i) {
                swap(nums, largest, i);
//                调整子树
                heapAdj(nums, length, largest);
            }


        }
    }

    /**
     * 冒泡排序
     */
    static class Solution2 {
        public int[] sortArray(int[] nums) {
            return maoPao(nums);
        }

        public int[] maoPao(int[] nums) {
            int len = nums.length;
            for (int i = 0; i < len - 1; i++) {
                boolean flag = false;//判断每一趟排序是否已经有序
                for (int j = 0; j < nums.length - 1 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int tem = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = tem;
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            return nums;
        }
    }

    /**
     * 堆排序
     */
    static class Solution3 {
        public int[] sortArray(int[] nums) {
//            todo
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int a :
                    nums) {
                priorityQueue.add(a);
            }
            int i = 0;
            while (!priorityQueue.isEmpty()){
                nums[i] = priorityQueue.poll();
                i++;
            }
            return nums;
//            return null;
        }
    }
}
