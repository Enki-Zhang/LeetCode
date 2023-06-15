/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_134 {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int i = new Solution().canCompleteCircuit(gas, cost);
        System.out.println(i);


    }

    //
//    static class Solution {
//        public int canCompleteCircuit(int[] gas, int[] cost) {
//            int rest = 0;
//            int index = 0;
//            boolean flag = false;
//            for (int j = 0; j < gas.length; j++) {
//                for (int i = 0; (index + i + 1) % gas.length != index; i++) {
//                    if ((index + i + 1) % gas.length == 0) {
//                        rest += gas[gas.length - 1] - cost[gas.length - 1];
//                    } else {
//                        rest += gas[(index + i + 1) % gas.length - 1] - cost[(index + i + 1) % gas.length - 1];
//                    }
//                    if (rest < 0) {
//                        flag = false;
//                        rest = 0;
//                        break;
//                    } else {
//                        flag = true;
//                    }
//                }
//                if (flag && rest - cost[index - 1] >= 0) {
//                    return index;
//                }
//                index++;
//            }
//            return -1;
//
//        }
//    }

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
}
