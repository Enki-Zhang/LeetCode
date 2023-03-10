package leetCodeHash.leetCodeHash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_15 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
//            ArrayList<Integer> integers = new ArrayList<>();
            List<List<Integer>> arrayLists = new ArrayList<>();
            if (nums.length < 3) {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            int left = 0;
            int right = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                left = i + 1;
                right = nums.length - 1;
                while (left < right) {
                    if (left < right && nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    }
                    if (left < right && nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    }
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[left]);
                        integers.add(nums[right]);
                        arrayLists.add(integers);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
            return arrayLists;

        }
    }
}
