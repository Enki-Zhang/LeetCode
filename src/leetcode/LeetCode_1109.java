package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1109 {
    public static void main(String[] args) {
    }

    /**
     * 差分数组 对区间和做修改 在原数组num[i]到 num[j]数组进行加n 为在差分数组i-(j+1)位置上加n
     */
    class Solution {
        public int[] corpFlightBookings(int[][] bookings, int n) {
            int[] dif = new int[n];
            int[] answer = new int[n];
            for (int i = 0; i < bookings.length; i++) {
                int start = bookings[i][0];
                int end = bookings[i][1];
                int seat = bookings[i][2];
//                for (int j = start-1; j < end; j++) {
//                    dif[j] += seat;
//                }
                dif[start - 1] += seat;
                if (end < dif.length) {
                    dif[end] -= seat;
                }
            }
            answer[0] = dif[0];
            for (int i = 1; i < dif.length; i++) {
                answer[i] = answer[i - 1] + dif[i];
            }
            return answer;


        }
    }
}
