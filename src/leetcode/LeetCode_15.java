package leetcode;

import java.nio.IntBuffer;
import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_15 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        Solution2 solution = new Solution2();
//        int[] ints = {-2, 0, 1, 1, 2};
//        List<List<Integer>> lists = solution.threeSum(ints);
//        System.out.println(lists);
    }

    /**
     * 三数之和 先进行排序 用三个指针 固定端 其余从两端进行扫描 当三数之和大于等于0 右指针左移 三数之和小于0左指针右移
     * 找到满足条件的指针后固定端继续不动
     * 直到扫描指针重合
     * 注意 三元组不能重复
     * 版本超时
     */
//    static class Solution {
//        public List<List<Integer>> threeSum(int[] nums) {
//            List<List<Integer>> lists = new ArrayList<>();
//            Arrays.sort(nums);
//            int left = 0;
//            int right = 0;
//            for (int index = 0; index < nums.length; index++) {
//                left = index + 1;
//                right = nums.length - 1;
//                while (left < right) {
//                    if (nums[index] + nums[left] + nums[right] < 0) {
//                        left++;
//                    } else if (nums[index] + nums[left] + nums[right] > 0) {
//                        right--;
//                    } else if (nums[index] + nums[left] + nums[right] == 0) {
//                        ArrayList<Integer> integers = new ArrayList<>();
//                        integers.add(nums[left]);
//                        integers.add(nums[right]);
//                        integers.add(nums[index]);
//                        if (!lists.contains(integers)){
//                            lists.add(new ArrayList<>(integers));
//                        }
//                        left++;
//                    }
//                }
//            }
//            return lists;
//
//        }
//    }

    /**
     * 超时 剪枝 排序后有相同的元素 需要跳过 固定指针大于0 跳过
     */
    static class Solution1 {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            int left = 0;
            int right = 0;
            for (int index = 0; index < nums.length; index++) {
                left = index + 1;
                right = nums.length - 1;
                if (nums[index] > 0) {
                    return lists;
                }
                if (index > 0 && nums[index] == nums[index - 1]) continue;
                while (left < right) {
                    if (nums[index] + nums[left] + nums[right] < 0) {
                        left++;
//                        去重
                    } else if (nums[index] + nums[left] + nums[right] > 0) {
                        right--;
//                        去重 当扫描指针相同
                    } else if (nums[index] + nums[left] + nums[right] == 0) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[left]);
                        integers.add(nums[right]);
                        integers.add(nums[index]);
                        lists.add(new ArrayList<>(integers));
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }
                }
            }
            return lists;

        }
    }

    /**
     * 双指针  先排序 注意首位指针 在注意两次去重
     */
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<Integer> path = new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
//            排序 可以去掉一些重复的元素
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                //<nums.length-2 保证遍历到末尾时也有三个元素
//          去重 比较每个三元组开始的元素是否和前一个三元组中相同
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
//                  两端的双指针
                    int left = i + 1;
                    int right = nums.length - 1;
                    int tar = -nums[i];
                    while (left < right) {
                        int sum = nums[left] + nums[right];
                        if (sum == tar) {
//                        去重 排序后中间重复的元素只取一个
                            res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            right--;
                            left++;
                        } else if (sum > tar) {
                            right--;
                        } else {
                            left++;
                        }
                    }
                }
            }
            return res;

        }


    }

    class Solution_re {
        public List<List<Integer>> threeSum(int[] nums) {
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
//                第一次去重
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int left = i + 1;
                    int right = nums.length - 1;
                    int tar = -nums[i];
//                    寻找满足条件的三元组
                    while (left < right) {
                        int sum = nums[left] + nums[right];
                        if (sum == tar) {
                            lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                            第二次去重 去掉满足条件的三元组
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            while (left < right && nums[left] == nums[left + 1]) left++;
//                            注意这里要在减去一次
                            right--;
                            left++;
                        } else if (sum > tar) {
//                            减少
                            right--;
                        } else {
                            left++;
                        }

                    }
                }
            }
            return lists;
        }
    }


}
