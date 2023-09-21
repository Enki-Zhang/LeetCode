import java.nio.IntBuffer;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;
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
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//        Solution3 solution = new Solution3();
//        int[] ints = solution.sortArray(nums);
//        for (int a :
//                ints) {
//            System.out.println(a);
//        }
        Solution5 solution5 = new Solution5();
        int[] ints = solution5.sortArray(new int[]{3, 2, 1, 5, 6, 4});
        for (int a :
                ints) {
            System.out.print(a + " ");
        }
    }

    /**
     * 快排
     */
    static class Solution {
        public int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void quickSort(int[] nums, int left, int right) {
            if (left < right) {
                int index = divIndex(nums, left, right);
                quickSort(nums, left, index - 1);
                quickSort(nums, index + 1, right);
            }
        }

        private int divIndex(int[] nums, int left, int right) {
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
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int a :
                    nums) {
                priorityQueue.add(a);
            }
            int i = 0;
            while (!priorityQueue.isEmpty()) {
                nums[i] = priorityQueue.poll();
                i++;
            }
            return nums;
        }
    }

    /**
     * 堆排序 先构造大根堆 将堆顶元素取出用堆底元素替换 重新构造大根堆
     */
    static class Solution4 {
        public int[] sortArray(int[] nums) {
            heapSort(nums);
            return nums;
        }

        private void heapSort(int[] nums) {
            int length = nums.length;

//            length/2-1 最后一个父节点
            for (int i = length / 2; i > 0; i--) {
                createHeap(nums, i, length);
            }
            for (int i = length - 1; i > 1; i--) {
                Swap(nums, nums[i], nums[1]);
                createHeap(nums, 1, i - 1);
            }
        }

        private void Swap(int[] nums, int i, int j) {
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
        }

        private void createHeap(int[] nums, int k, int length) {
            nums[0] = nums[k];//将元素k为根的子树进行调整
            for (int i = 2 * k; i < length; i *= 2) {
                if (i < length && nums[i] < nums[i + 1]) {
                    i++;
                }
                if (nums[0] >= nums[i]) break;
                else {
                    nums[k] = nums[i];
                    k = i;
                }
            }
            nums[k] = nums[0];
        }
    }

    /**
     * 归并排序 二路归并排序 两两比较 将两个有序的数组复制到新的数组中去排序
     */
    static class Solution5 {
        public int[] sortArray(int[] nums) {
            mergeSort(nums, 0, nums.length - 1);
            return nums;
        }

        private void mergeSort(int[] nums, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(nums, left, mid);
                mergeSort(nums, mid + 1, right);
                MergeDiv(nums, left, mid, right);
            }
        }

        private void MergeDiv(int[] nums, int left, int mid, int right) {
            int[] temp = new int[nums.length];
            for (int i = left; i <= right; i++) {
                temp[i] = nums[i];
            }
            int i = left;
            int j = mid + 1;
            int k = left;
            for (i = left, j = mid + 1, k = left; i <=mid && j <= right; k++) {
                if (temp[i] <= temp[j]) {
                    nums[k] = temp[i];
                    i++;
                } else {
                    nums[k] = temp[j];
                    j++;
                }
            }
            while (i <=mid) {
                nums[k] = temp[i];
                i++;
                k++;
            }
            while (j <= right) {
                nums[k] = temp[j];
                k++;
                j++;
            }
        }
    }
}

