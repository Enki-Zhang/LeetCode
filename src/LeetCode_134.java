/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_134 {
    public static void main(String[] args) {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int i = new Solution2().canCompleteCircuit(gas, cost);
        System.out.println(i);


    }


    /**
     * 超时
     */
    static class Solution {
        //        判断循环队列是否满 (index+1)%size == index
        public int canCompleteCircuit(int[] gas, int[] cost) {
            for (int i = 0; i < gas.length; i++) {
                int res = gas[i] - cost[i];
                int index = (i + 1) % gas.length;
                while (res > 0 && index != i) {
                    res += gas[index] - cost[index];
                    index = (index + 1) % gas.length;
                }
                if (res >= 0 && index == i)
                    return index;
            }
            return -1;

        }
    }

    /**
     * 选择每一个gas>=cost的加油站 开始遍历
     */
    static class Solution2 {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int length = gas.length;
            int res = 0;
            for (int i = 0; i < gas.length; i++) {
                if (gas[i] >= cost[i]) {
                    int start = i + 1;
//                   环形遍历
                    while (start + 1 % length != i) {
                        res = res + gas[start] - cost[start];
                        start = start+1%length;
                    }
                    if (res >= 0) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

}
