package hashmap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LeetCode18
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/17 15:55
 * @Verison 1.0
 **/
public class LeetCode18 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            ArrayList<Integer> integers = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            for (int first = 0; first < nums.length - 3; first++) {
                //去重
                if (first > 0 && nums[first] == nums[first - 1]) continue;
                for (int second = first + 1; second < nums.length - 2; second++) {
                    //去重
                    if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                    int left = second + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        BigInteger sum = BigInteger.valueOf(nums[first])
                                .add(BigInteger.valueOf(nums[second]))
                                .add(BigInteger.valueOf(nums[left]))
                                .add(BigInteger.valueOf(nums[right]));
                        if (sum.equals(BigInteger.valueOf(target))) {
                            integers.add(nums[first]);
                            integers.add(nums[second]);
                            integers.add(nums[left]);
                            integers.add(nums[right]);
                            result.add(new ArrayList<>(integers));
                            integers.clear();
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            while (left < right && nums[right] == nums[right - 1]) right--;
                            left++;
                            right--;
                        } else if (sum.compareTo(BigInteger.valueOf(target)) > 0) right--;
                        else left++;
                    }
                }

            }
            return result;
        }
    }
}
