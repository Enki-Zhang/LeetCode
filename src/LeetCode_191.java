/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_191 {
    public static void main(String[] args) {
        int a = 00000000000000000000000000001011;
        System.out.println(1<<a);
    }
// 求输入1的个数
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                if ((n &(1<<i))!=0){
                    res++;
                }
            }

            return res;

        }
    }
}
