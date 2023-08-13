import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Enki
 * @ClassName LeetCode_137
 * @Description: TODO
 * @Date 2023/8/13 11:08
 * @Version 1.0
 */
public class LeetCode_137 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));

    }

    /**
     * 只出现一次的数字 先排序的时间复杂度就不是线性的
     */
//        static class Solution {
//            public int singleNumber(int[] nums) {
//                Arrays.sort(nums);
//                int index = 0;
//                while (index < nums.length) {
//                    if (index+1<nums.length &&nums[index] == nums[index + 1]) {
//                        index += 3;
//                    } else return nums[index];
//                }
//                return 0;
//            }
//        }

    /**
     * 遍历所有元素并存入到 hash中 保存出现次数
     */
    static class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num :
                    nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> next : map.entrySet()) {
                if (next.getValue() != 3) {
                    return next.getKey();
                }
            }
            return 0;
        }
    }
}
