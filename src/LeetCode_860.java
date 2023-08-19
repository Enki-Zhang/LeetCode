/**
 * @author Enki
 * @ClassName LeetCode_860
 * @Description: TODO
 * @Date 2023/8/19 9:20
 * @Version 1.0
 */
public class LeetCode_860 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lemonadeChange(new int[]{5, 5, 5, 5, 20, 20, 5, 5, 20, 5}));

    }

    /**
     * 卖柠檬水 将5元零钱入账 用来找零 优先消耗10元 若没有5元则失败
     */
    static class Solution {
        public boolean lemonadeChange(int[] bills) {
            int lingQian5 = 0;
            int lingQian10 = 0;
            for (int i = 0; i < bills.length; i++) {
//                5元直接进账
                if (bills[i] == 5) {
                    lingQian5++;
                }
//                10元消耗一张五元 增加一张10元
                if (bills[i] == 10) {
                    lingQian10++;
                    lingQian5--;
                }
//                20元 消耗一张10元一张5元 或者三张5元
                if (bills[i] == 20) {
                    if (lingQian10 > 0) {
                        lingQian10--;
                    } else {
                        lingQian5--;
                        lingQian5--;
                    }
                    lingQian5--;
                }
                if (lingQian5 < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
